package com.redson.sort;

/**
 * Created by 1109806 on 2020/11/20.
 */
public class QuickSort {
    private static void swap(int[] a, int i, int j) {
        int tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static void quickSort(int[] a, int startIdx, int endIdx) {
        if( startIdx >= endIdx )
            return;

        int pivotIdx = startIdx;
        int i = startIdx + 1;
        int j = endIdx;
        while( i <= j ) {
            while(a[pivotIdx] >= a[i] && i < endIdx)
                i++;
            while(a[pivotIdx] <= a[j] && j > startIdx)
                j--;

            if( i < j )
                swap(a, i, j);
            else
                swap(a, pivotIdx, j);
        }

        quickSort(a, startIdx, j-1);
        quickSort(a, j+1, endIdx);
    }

    public static void main(String[] args) {
        int[] a = {5,2,9,3,6,8,1,10,7,4};
        quickSort(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
