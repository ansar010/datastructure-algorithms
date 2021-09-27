package com.ansar.dsalgo.cci.arrays_and_string;

/**
 * This class implement a code to check a string has unique char or not
 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("Helo"));
        countRepeatLetter("Heelloppppo");
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

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
