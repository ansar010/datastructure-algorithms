package com.ansar.dsalgo.search;

/**
 * This implement binary search algo which divides array in two parts and
 * compare the element, Array must sorted for this search
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int searchElement = 5;
        int searchIndex = binarySearch(arr, searchElement);
        System.out.println(searchIndex);
    }

    private static int binarySearch(int[] arr, int searchElement) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (searchElement == arr[mid]) {
                return mid;
            }
            if (arr[mid] < searchElement) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
