package com.ansar.dsalgo.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        ReverseArray revArr = new ReverseArray();
        reverseArray(numbers, 0, numbers.length - 1);
        revArr.printArray(numbers);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public void printArray(int[] arr) {
        int length = arr.length - 1;
        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
