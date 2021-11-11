package com.ansar.dsalgo.string;

/**
 * Implementing a program to trim the string eg:"  The String   "
 * result would be "The String"
 */
public class TrimTheString {
    public static void main(String[] args) {
        String str = "   Welcome to String Program    ";
        char[] charArray = str.toCharArray();

        int startStr, endStr, count;
        startStr = 0;
        endStr = 0;

        //Loop to define start string
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                startStr = i;
                break;
            }
        }

        // startStr - 1 to traverse till the first letter
        for (int i = charArray.length - 1; i > startStr - 1; i--) {
            if (charArray[i] != ' ') {
                endStr = i;
                break;
            }
        }

        // we add +1 because in char array index value start from 0  
        count = endStr - startStr + 1;// count to define length of new string

        String finalStr = new String(charArray, startStr, count); // CharArray i want from this start index to till this end index
        System.out.println(finalStr);
    }
}
