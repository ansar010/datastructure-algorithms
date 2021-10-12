package com.ansar.dsalgo.array;

/**
 * This program implements methods for array insertion, deletion,traversal etc.
 */
public class ArrInsertionWithSameArr {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int arrSize, indexPosition, element;
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arrSize = 4;
        indexPosition = 1;
        element = 5;
        System.out.println("Array before insertion");
        printArray(arr, arrSize - 1);
        int arrInsert = indInsert(arr, arrSize, arr.length, indexPosition, element);
        arrSize++;
        if (arrInsert == 1) {
            System.out.println("Array After insertion");
            printArray(arr, arrSize - 1);
        } else {
            System.out.println("Capacity overflow");
        }
//        int sortedInsert = sortedInsert(arr, arrSize, arr.length, element);
//        arrSize++;
//        printArray(arr, arrSize - 1);
    }

    private static void printArray(int[] arr, int length) {
        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * @param size          takes the filled array size
     * @param capacity      total capacity of an array
     * @param indexPosition poistion to insert element
     * @param element       value to insert
     * @return
     */
    private static int indInsert(int[] arr, int size, int capacity, int indexPosition, int element) {
        //check array has capacity to insert new element.
        if (size >= capacity)
            return -1;

        //loop to shift elements to right of the insert index
        for (int i = size - 1; i >= indexPosition; i--) {
            arr[i + 1] = arr[i];
        }

        //Insert the element in given index above for loop will shift the elements
        arr[indexPosition] = element;
        return 1;
    }

    /**
     * @param size     takes the filled array size
     * @param capacity total capacity of an array
     * @param element  value to insert
     * @return
     */
    private static int sortedInsert(int[] arr, int size, int capacity, int element) {
        //check array has capacity to insert new element.
        if (size >= capacity)
            return -1;
        int i;
        //loop to shift elements to right of the insert index
        for (i = size - 1; (i >= 0 && arr[i] > element); i--) {
            arr[i + 1] = arr[i];
        }

        //Insert the element in given index above for loop will shift the elements
        arr[i + 1] = element;
        return 1;
    }
}
