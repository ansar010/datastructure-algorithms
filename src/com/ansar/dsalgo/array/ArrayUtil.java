package com.ansar.dsalgo.array;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }

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
}
