package com.ansar.dsalgo.array;

public class FindPalindrome {
    public static void main(String[] args) {
        String name = "maLayaLaM";
        boolean isPalindrome = isPalindrom(name);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrom(String word) {
        char[] charArray = word.toLowerCase().toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
