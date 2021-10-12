package com.ansar.dsalgo.sort;

import java.util.Arrays;

/**
 * Program to implement sort method using selection sort technique
 * In SelectionSort it takes element from 0th index and compare it with rest of the element
 * if any element less than current element then that element update in min variable
 * O(n^2), It's stable algorithm.
 * it's not stable nor adaptive.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 7, 1, 6};
        int length = arr.length;
        System.out.println("Before Selection sort : " + Arrays.toString(arr));
        selectionSort(arr, length);
        System.out.println("After Selection sort  : " + Arrays.toString(arr));
    }


    private static void selectionSort(int[] arr, int n) {
        int indexOfMin, temp;
        //n - 1 is array traversal
        for (int i = 0; i < n - 1; i++) {
            indexOfMin = i;//it hold minimum value's index

            //inner loop to traverse from i + 1 to n like
            //compares the min index value with rest of subsequent value in an array
            for (int j = i + 1; j < n; j++) {
                //check if adjacent value is less than min index value
                // > for desc sort
                if (arr[j] < arr[indexOfMin]) {
                    //if adjacent value is less than current min index value then
                    //replace that index in min variable
                    indexOfMin = j;
                }
            }
            //swap Arr[i]->pass index number with min index value
            temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }
}
