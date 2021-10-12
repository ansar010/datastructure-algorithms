package com.ansar.dsalgo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Program implements methods to insert an element in array
 * return new array with extended size
 */
public class ArrayInsertion {
    public static void main(String[] args) {
        int element, index, length;
        int[] arr = {5, 1, 3, 2, 7};
        Integer[] arrInt = {8, 2, 5, 4, 7};
        index = 3;
        element = 9;
        length = arr.length;
        System.out.println("Before Insertion: " + Arrays.toString(arr));
        arr = insertAtIndex(arr, length, index, element);
        System.out.println("After Insertion: " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Before Insertion using collection: " + Arrays.toString(arrInt));
        arrInt = insertAtIndexUsingArrayList(arrInt, index, element);
        System.out.println("Array Inserted using: " + Arrays.toString(arrInt));
    }

    /**
     * Insert element in at given index by using collection framework
     *
     * @param arr     given array
     * @param index   index at which element needs to be inserted
     * @param element element to be inserted at given index
     * @return returns the array with inserted new element
     */
    private static Integer[] insertAtIndexUsingArrayList(Integer[] arr, int index, int element) {
        //convert array into an arraylist
        List<Integer> arrayList = new ArrayList(Arrays.asList(arr));

        //Add element at given index
        arrayList.add(index, element);

        //convert arraylist into an array
        arr = arrayList.toArray(arr);

        return arr;
    }

    /**
     * @param arr     consist the old array
     * @param length  length of an array
     * @param index   index to insert an element
     * @param element value to insert
     * @return new array with element
     */
    private static int[] insertAtIndex(int[] arr, int length, int index, int element) {
        //Initialize new array with extended size
        int[] newArr = new int[length + 1];

        //Traverse to copy existing array elements in new array with new element
        for (int i = 0; i <= length; i++) {

            if (i < index) {//copy exiting elements till the index
                newArr[i] = arr[i];
            } else if (i == index) {//copy elements at index
                newArr[i] = element;
            } else {//copy existing element by shifting left adjacent
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}
