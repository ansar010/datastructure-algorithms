package com.ansar.dsalgo.array;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 0, 5, 0, 0, 3, 4, 5, 6};
        MoveZeros mz = new MoveZeros();
        moveZeros(numbers, numbers.length);
        mz.printArray(numbers);
    }

    private static void moveZeros(int[] arr, int length) {
        int j = 0;// points to 0 value
        // i points to non-zero elements
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
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
