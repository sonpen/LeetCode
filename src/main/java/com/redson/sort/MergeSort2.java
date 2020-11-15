package com.redson.sort;

/**
 * Created by 1109806 on 2020/11/14.
 *
 * MergeSort 는 반복해 new를 하는 문제가 있으니 개선해보자
 */
public class MergeSort2 {

    private static int sorted[];

    public static void mergeSort(int a[], int s, int e) {
        if (s >= e)
            return;
        int mid = (s + e) / 2;
        mergeSort(a, s, mid);
        mergeSort(a, mid+1, e);
        merge(a, s, mid, e);
    }

    public static void merge(int[] a, int s, int mid, int e) {
        int i = s;
        int j = mid+1;
        int k = s;

        while(i <= mid && j <= e) {
            if( a[i] < a[j]) {
                sorted[k++] = a[i++];
            }
            else {
                sorted[k++] = a[j++];
            }
        }

        while(i <= mid) {
            sorted[k++] = a[i++];
        }
        while(j <= e) {
            sorted[k++] = a[j++];
        }

        for(int l = s; l < k; l++) {
            a[l] = sorted[l];
        }
    }

    public static void main(String[] args) {
        int a[] = {3,2,2,5,7,9,1,4,7};

        sorted = new int[a.length];
        mergeSort(a, 0, a.length-1);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

    }


}
