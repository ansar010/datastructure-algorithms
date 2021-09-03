package com.ansar.dsalgo.array;

public class MinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 2, 4, 9};
        MinArray mn = new MinArray();
        System.out.println(mn.findMinimum(numbers));
    }

    private int findMinimum(int[] arr) {
        // edge
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid value");
        }

        int min = arr[0]; // min will hold the minimum value of an array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
