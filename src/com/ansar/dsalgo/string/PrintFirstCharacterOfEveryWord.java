package com.ansar.dsalgo.string;

/**
 * Implement a program to print First Character of every word.
 */
public class PrintFirstCharacterOfEveryWord {
    public static void main(String[] args) {
        String str = "Hi, this is a String";
        char[] charArray = str.toCharArray();

        // Traverse a char array. check char[i] != ' '
        // then print if first char index is 0
        // check char's previous index is space to print first char of word

        for (int i = 0; i < charArray.length; i++) {
            // check for char which should not has space
            if (charArray[i] != ' ') {
                if (i == 0) {
                    System.out.print(charArray[i]);
                } else if (charArray[i - 1] == ' ') {
                    System.out.print(charArray[i]);
                }
            }
        }
    }
}
