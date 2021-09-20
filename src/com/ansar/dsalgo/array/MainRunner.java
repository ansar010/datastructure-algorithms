package com.ansar.dsalgo.array;

public class MainRunner {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 0, 0, 6};
//        int[] arr = {6, 3, 4, 5, 8, 6};
        ArrayUtil au = new ArrayUtil();
//        au.arrayDemo();
        au.printArray(arr);
        au.reverseArray(arr); //Reverse an arry
        au.printArray(arr);

        System.out.println(au.findMinimum(arr)); //Find minimum number in an array

        au.moveZeroToEnd(arr); //Move Zeros to end of an array
        au.printArray(arr);

        System.out.println("Before array Resize " + (arr.length - 1)); //Resize an array size
        arr = au.reziseArray(arr, (arr.length - 1) * 2);
        System.out.println("After array Resize " + arr.length);

        boolean isPalindrome = au.isPalindrom("MAm");
        System.out.println("Is palindorme? " + isPalindrome);
    }
}
