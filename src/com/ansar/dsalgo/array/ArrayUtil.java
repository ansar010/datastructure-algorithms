package com.ansar.dsalgo.array;

public class ArrayUtil {

    public void arrayDemo() {
        int[] myArray = new int[5];//default values
        //initializing an array
        myArray[0] = 1;
        myArray[1] = 6;
        myArray[2] = 2;
        myArray[3] = 8;
        myArray[4] = 5;
        printArray(myArray);
    }

    public void printArray(int[] arr) {
        int length = arr.length - 1;
        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public int findMinimum(int[] arr) {
        int minimum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minimum]) {
                minimum = i;
            }
        }
        return arr[minimum];
    }

    //[2,3,0,1,0,0,3,4,5]
    public void moveZeroToEnd(int[] arr) {
        int non_zero_element = 0;
        int zero_element = 1;
        while (zero_element < arr.length) {
            if (arr[non_zero_element] == 0 && arr[zero_element] != 0) {
                int temp = arr[non_zero_element];
                arr[non_zero_element] = arr[zero_element];
                arr[zero_element] = temp;
                non_zero_element++;
            }
            if (arr[non_zero_element] != 0) {
                non_zero_element++;
            }
            zero_element++;
        }
    }

    public int[] reziseArray(int[] arr, int length) {
        int[] temp = new int[length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public boolean isPalindrom(String string) {
        char[] charArray = string.toLowerCase().toCharArray();
        int length = charArray.length - 1;
        for (int i = 0; i <= length; i++) {
            if (charArray[i] != charArray[length])
                return false;
            length--;
        }
        return true;
    }
}
