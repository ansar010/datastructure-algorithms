package com.ansar.dsalgo.string;

import java.util.Arrays;

/**
 * Program to reverse a string
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome to Reverse String";
        int start, end;
        char[] charArray = str.toCharArray();
        start = 0;
        end = charArray.length - 1;
        while (start < end) {
            //Swap
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        String resultString = String.valueOf(charArray);
        System.out.println(resultString);
    }
}
