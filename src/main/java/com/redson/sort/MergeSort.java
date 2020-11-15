package com.redson.sort;

/**
 * Created by 1109806 on 2020/11/14.
 */
public class MergeSort {

    public static void mergeSort(int a[], int n) {
        if( n < 2)
            return;

        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];

        for(int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for(int j = mid; j < n; j++) {
            r[j-mid] = a[j];
        }

        mergeSort(l, mid);
        mergeSort(r, n-mid);
        merge(a, l, r, mid, n-mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int lLen, int rLen) {
        int aIdx =0, lIdx =0, rIdx=0;
        while(lIdx < lLen && rIdx < rLen) {
            if(l[lIdx] < r[rIdx]) {
                a[aIdx++] = l[lIdx++];
            } else {
                a[aIdx++] = r[rIdx++];
            }
        }

        while(lIdx < lLen) {
            a[aIdx++] = l[lIdx++];
        }
        while(rIdx < rLen) {
            a[aIdx++] = r[rIdx++];
        }
    }

    public static void main(String[] args) {
        int a[] = {3,2,5,7,9,1,4,7};
        mergeSort(a, a.length);
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


}
