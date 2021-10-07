package com.ansar.dsalgo.cci.arrays_and_string;

/**
 * This class implement a code to check a string has unique char or not
 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("mzu"));
//        countRepeatLetter("Heelloppppo");
    }

    private static void countRepeatLetter(String str) {
        int[] char_set = new int[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.toLowerCase().charAt(i);
            char_set[val] += 1;
        }
        System.out.println(char_set[(int)'p']);
    }

    private static boolean isUnique(String str) {
        //ASCII has totally 0-127 char here we validate if the str
        //length is above 128 then for sure it would have repeat any char
        // so it's not unique
        if (str.length() > 128) {
            return false;
        }

        //create array size 128 to store letter in ASCII index
        boolean[] char_set = new boolean[128];

        //Traverse till string length
        for (int i = 0; i < str.length(); i++) {
            //In int data type charAt() will return ASCII index of i
            int val = str.charAt(i);

//            System.out.println(val);

            //Return not unique if index has true value
            if (char_set[val]) {
                return false;
            }
            //Making the ASCII index value true
            char_set[val] = true;
        }
        return true;
    }
}
