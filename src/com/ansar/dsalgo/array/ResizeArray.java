package com.ansar.dsalgo.array;

public class ResizeArray {
    public static void main(String[] args) {
        int[] originalArray = new int[]{1,2,3,4,5};
        ResizeArray resizeArray = new ResizeArray();
        System.out.println("The size of original Array - "+originalArray.length);
        originalArray = resizeArray(originalArray, originalArray.length * 2);
        System.out.println("The size of original Array after resize - " + originalArray.length);
    }

    private static int[] resizeArray(int[] originalArray, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < originalArray.length; i++) {
            temp[i] = originalArray[i];
        }
        return temp;
    }


    public void printArray(int[] arr) {
        int length = arr.length - 1;
        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
