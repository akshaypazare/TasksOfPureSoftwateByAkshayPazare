package com.PureSoftware.Tasks.BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int left, int right) {

        if (right >= left) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] > target) {
                return binarySearch(arr, target, left, mid - 1);
            }

            else {
                return binarySearch(arr, target, mid + 1, right);
            }
        }

        else {
            return -1;
        }


    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 12, 16, 19, 25, 31};
        int target = 16;

        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }

    }
}
