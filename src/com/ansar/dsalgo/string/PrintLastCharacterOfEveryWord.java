package com.ansar.dsalgo.string;

/**
 * Implement a program to print Last Character of every word.
 */
public class PrintLastCharacterOfEveryWord {
    public static void main(String[] args) {
        String str = "Hi, this is a String to print last char";
        char[] charArray = str.toCharArray();

        // Traverse a char array. check char[i] != ' '
        // then print if last char index is length - 1
        // check char's previous index is space to print first char of word

        for (int i = 0; i < charArray.length; i++) {
            // check for char which should not has space
            if (charArray[i] != ' ') {
                if (i == charArray.length - 1) {
                    System.out.print(charArray[i]);
                } else if (charArray[i + 1] == ' ') {
                    System.out.print(charArray[i]);
                }
            }
        }
    }
}
