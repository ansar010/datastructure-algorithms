package com.ansar.dsalgo.sort;

import java.util.Arrays;

/**
 * Implements a program to sort using insertion sort technique.
 * Where an array divided into two parts one is sorted and another one is unsorted
 * Take one one element from unsorted part by assing it in key variable
 * and compare it to each element of sorted part then place the element where the prior element is <
 * O(n^2), It's stable algorithm,and it's adaptive
 * Traverse an array n-1
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 7, 1, 6};
        int length = arr.length;
        System.out.println("Before Insertion sort : " + Arrays.toString(arr));
        insertionSort(arr, length);
        System.out.println("After Insertion sort  : " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        //Declare key to hold element from unsorted par
        // j for the comparison
        int key, j;

        //taking i as 1 because we consider first element as sorted initially
        //traverse till last index of an arr hence <= n - 1
        for (int i = 1; i <= n - 1; i++) {
            key = arr[i]; // in first pass key would be arr[0]
            j = i - 1; // in first pass j would be 0

            //check if i is >= 0 to avoid looping minus values
            //check prior element is greater than subsequent element for swap
            //arr[j] < key comparison would be less than for Desc order
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                arr[j] = key;
                j--; //decrement j to compare key with all left/sorted elements
            }

            //place key in same index if while loop doesn't true
            //place element at 0th index if j decremented till -1 and key is less than all ele.
            arr[j + 1] = key;
        }
    }
}
