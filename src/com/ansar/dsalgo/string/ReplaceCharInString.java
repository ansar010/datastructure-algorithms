package com.ansar.dsalgo.string;

/**
 * Program to replace char in string
 */
public class ReplaceCharInString {
    public static void main(String[] args) {
        String str = "Welcome to String Replace Program";
        char oldChar, newChar;
        oldChar = 'e';
        newChar = 'a';
//        String finalStr = str.replace('e', 'a');
//        System.out.println(finalStr);
        char[] charArray = str.toCharArray();
        repaceChar(charArray, oldChar, newChar);
        System.out.println(charArray);
    }

    // Since Array and object sends reference as argument
    // if modify it the main object will get affected
    private static void repaceChar(char[] charArr, char oldChar, char newChar) {

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == oldChar) {
                charArr[i] = newChar;
            }
        }
    }
}
