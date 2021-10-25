package com.ansar.dsalgo.string;

import java.util.Stack;

/**
 * Implement a program to perform following string operations.
 * Reverse String
 * Reverse individual word in string
 * Reverse word in string.
 */
public class StringOperataions {
    public static void main(String[] args) {
        String str = "This is a string program";

//        String reversedString = reverseString(str);
//        System.out.println(reversedString);

//        String reversedIndividualWord = revIndWrd_M1(str);
//        System.out.println(reversedIndividualWord);

//        String reversedIndividualWord = revIndWrd_M2(str);
//        System.out.println(reversedIndividualWord);

//        String reversedIndividualWord = revIndWrd_M3(str);
//        System.out.println(reversedIndividualWord);

//        String reversedWord = reverseWord_M1(str);
//        System.out.println(reversedWord);

//        String reversedWord = reverseWord_M2(str);
//        System.out.println(reversedWord);

        String reversedWord = reverseWord_M3(str);
        System.out.println(reversedWord);

    }

    /**
     * Method to reverse the words from string using reverse string then reverse individual word
     *
     * @param str
     * @return
     */
    private static String reverseWord_M3(String str) {
        //Reverse the string
        String reversedString = reverseString(str);
//        System.out.println(reversedString);
        //Reverse individual word of a string
        String reversedWord = revIndWrd_M2(reversedString);
//        System.out.println(reversedWord);
        return reversedWord;
    }

    /**
     * Method to reverse the words from string using StringBuilder/StringBuffer approach
     * ie., Hello this is Word
     * Word this is Hello
     *
     * @param str
     * @return
     */
    private static String reverseWord_M2(String str) {
        // To store each word in reverse way using index at 0
        StringBuilder tempStr = new StringBuilder();

        // To store reversed word with space char and return final str
        StringBuilder finalStr = new StringBuilder();

        //Traverse given string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                //prepend each temp word with space after each word
                finalStr = finalStr.insert(0, tempStr).insert(0, " ");

                //clear out the temp to store new word in prepend way
                tempStr.setLength(0);
            } else {
                // append the char
                tempStr.append(c);
            }
        }
        //store last word since it wont come into above loop
        finalStr = finalStr.insert(0, tempStr);

        return finalStr.toString();
    }

    /**
     * Method to reverse the words from string using concatenate approach
     * ie., Hello this is Word
     * Word this is Hello
     *
     * @param str
     * @return
     */
    private static String reverseWord_M1(String str) {
        String tempStr, finalStr;

        // To store each word in reverse way using prefix concatenation
        tempStr = "";

        // To store reversed word with space char and return final str
        finalStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                //prepend each word stored in tempStr with space
                finalStr = " " + tempStr + finalStr;
                tempStr = "";
            } else {
                tempStr = tempStr + c;
            }
        }

        finalStr = tempStr + finalStr;

        return finalStr;
    }

    /**
     * Method to reverse individual word of a string using stack
     *
     * @param str takes string argument
     * @return reversed individual word string
     */
    private static String revIndWrd_M3(String str) {
        StringBuilder finalStr = new StringBuilder();
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                while (!stack.isEmpty()) {
                    finalStr.append(stack.pop());
                }
                finalStr.append(" ");
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            finalStr.append(stack.pop());
        }
        return finalStr.toString();
    }

    /**
     * Method to reverse individual word of a string using StringBuilder/StringBuffer approach
     * it will keep create string obj for each iteration as string is immutable, to overcome this
     * stringBuilder/StringBuffer can be used.
     *
     * @param str takes string argument
     * @return reversed individual word string
     */
    private static String revIndWrd_M2(String str) {
        // To store each word in reverse way using index at 0
        StringBuilder tempStr = new StringBuilder();

        // To store reversed word with space char and return final str
        StringBuilder finalStr = new StringBuilder();

        //Traverse given string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                //append each temp word with space after each word
                finalStr = finalStr.append(tempStr).append(" ");

                //clear out the temp to store new word in prepend way
                tempStr.setLength(0);
            } else {
                // prepend the char
                tempStr.insert(0, c);
            }
        }
        //store last word since it wont come into above loop
        finalStr = finalStr.append(tempStr);

        return finalStr.toString();
    }

    /**
     * Method to reverse individual word of a string using concatenation approach
     * it will keep create string obj for each iteration as string is immutable, to overcome this
     * stringBuilder/StringBuffer can be used.
     *
     * @param str takes string argument
     * @return reversed individual word string
     */
    private static String revIndWrd_M1(String str) {
        String tempStr, finalStr;

        // To store each word in reverse way using prefix concatenation
        tempStr = "";

        // To store reversed word with space char and return final str
        finalStr = "";

        //Traverse given string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                //append each prepended word with space after each word
                finalStr = finalStr + tempStr + " ";
                //clear out the temp var to store new word in prepend way
                tempStr = "";
            } else {
                // prepend the char
                tempStr = c + tempStr;
            }
        }
        //store last word since it wont come into above loop
        finalStr = finalStr + tempStr;

        return finalStr;
    }

    /**
     * Method to reverse a given string
     *
     * @param str takes string argument
     * @return reversed string
     */
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        //variables to perform swap based on front and end index number
        int start, end;
        start = 0;
        end = charArray.length - 1;
        while (start < end) {
            //swap
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(charArray);
    }
}
