package com.ansar.dsalgo.array;

/**
 * Program to implement array deletion
 */
public class ArrayDeletion {
    public static void main(String[] args) {
        int length, index;
        int[] arr = {2, 4, 1, 5, 3};
        length = arr.length;
        index = 0;
        arr = indexDeletion(arr, length, index);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] indexDeletion(int[] arr, int length, int index) {
        // initialise new array with 1 size extra
        // put older array elements in new array by shifting the elements to left adjacent
        // to deleted element then return the new array
        int[] newArr = new int[length -1];

        for (int i = 0; i < length - 1; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }
}
