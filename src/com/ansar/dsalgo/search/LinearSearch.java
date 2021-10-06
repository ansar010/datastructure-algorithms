package com.ansar.dsalgo.search;

public class LinearSearch {
    public static void main(String[] args) {
        Integer[] arr = {2, 1, 3, 4, 5, 6, 7};
        Integer integer = linearSearch(arr, 4, arr.length);
        System.out.println(integer);

        Character[] charArray = {'a', 'b', 'c', 'd'};
        int indexVal = linearSearch(charArray, 'c', charArray.length);
        System.out.println(indexVal);
    }

    public static <T> int linearSearch(T[] arr, T element, int length) {
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
