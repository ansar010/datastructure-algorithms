package com.ansar.dsalgo.sort;

import java.util.Arrays;

/**
 * Implement a method to sort given array using bubble sort concept
 * In which higher elements goes to the end of the array
 * O(n^2), It's stable algorithm
 * By default it's not adaptive we can make it adaptive using isSorted flag
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 9, 4, 11, 5};
//        int[] arr = {1, 2, 3, 4, 5, 6};
        int length = arr.length;
        System.out.println("Before Sort: " + Arrays.toString(arr));
        bubbleSort(arr, length);
//        adaptiveBubbleSort(arr, length);
        System.out.println("After sort: " + Arrays.toString(arr));
    }

    /**
     * sort using bubble sort enabling adaptive in it.
     * it wont traverse array if the array is already sorted
     *
     * @param arr
     * @param n   length of an array
     */
    private static void adaptiveBubbleSort(int[] arr, int n) {
        //flag to track whether the array is sorted or not
        boolean isSorted = true;

        //outer for loop to number of passes n - 1 n is n
        for (int i = 0; i < n - 1; i++) {
            int pass = i + 1;
            System.out.println("Number of passes:" + pass);
            //Inner for loop is for number of comparison in one pass
            // for ex: array size is 5 then number of passes would be
            // 4,3,2,1 hence n - 1 - i where i has value 0 to less than n - 1
            for (int j = 0; j < n - 1 - i; j++) {
                //check to swap element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
    }

    private static void bubbleSort(int[] arr, int n) {
        //outer for loop to number of passes n - 1 n is n
        for (int i = 0; i < n - 1; i++) {
            //Inner for loop is for number of comparison in one pass
            // for ex: array size is 5 then number of passes would be
            // 4,3,2,1 hence n - 1 - i where i has value 0 to less than n - 1
            for (int j = 0; j < n - 1 - i; j++) {
                //check to swap element
                //compare with less than for descending order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
