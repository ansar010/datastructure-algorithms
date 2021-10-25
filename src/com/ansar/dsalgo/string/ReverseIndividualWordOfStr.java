package com.ansar.dsalgo.string;

import java.util.Stack;

/**
 * Program to reverse individual word of a string
 */
public class ReverseIndividualWordOfStr {
    public static void main(String[] args) {
        String str = "Reverse the individual word of a string.";

        // String is immuatble so it will keep create copy.
//        String result = reverseUsingConcatenate_m1(str);
//        System.out.println(result);

        // To overcome string immutable prob.
//        String result = reverseUsingStrBuilder_m2(str);
//        System.out.println(result);

        String result = reverseUsingStack_m3(str);
        System.out.println(result);
    }

    private static String reverseUsingStack_m3(String str) {
        Stack st = new Stack();
        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != ' ') {
                st.push(str.charAt(i));
            } else {
                while (!st.isEmpty()) {
//                    System.out.print(st.pop());
                    finalString = finalString + st.pop();
                }
//                System.out.print(" ");
                finalString = finalString + ' ';
            }
        }

        //for last word
        while (!st.isEmpty()) {
//            System.out.print(st.pop());
            finalString = finalString + st.pop();
        }
        return finalString;
    }

    //Method 2:
    //create two stringbuilder obj temp,final str
    //store each word in tempStr obj using insert() by splitting the word using space as delimiter.
    //reverse it by storing each char at 0th index.
    //add in final str.
    private static String reverseUsingStrBuilder_m2(String str) {

        StringBuilder tempStr = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                // insert at 0 index it will shift remaining at right side.
                tempStr.insert(0, c);
            } else {
                finalStr.append(tempStr).append(" ");
                //clearing out existing word.
                tempStr.setLength(0);
            }
        }
        finalStr.append(tempStr);
        return finalStr.toString();
    }

    //Method 1:
    //take two variable temp,final str
    //store each word in tempStr var by splitting the word using space as delimiter,reverse it
    //check for str != space, then pre-concat => tempStr = char + tempStr;
    //add in final str.
    private static String reverseUsingConcatenate_m1(String str) {
        String tempStr, finalStr;

        //store individual word to reverse
        tempStr = "";

        //store final reversed string
        finalStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                tempStr = str.charAt(i) + tempStr;
            } else {
                // " " space to add after each word.
                finalStr = finalStr + tempStr + " ";
                // clearing tempStr to store next word.
                tempStr = " ";
            }
        }
        //store last reversed word.
        finalStr = finalStr + tempStr;
        return finalStr;
    }
}
