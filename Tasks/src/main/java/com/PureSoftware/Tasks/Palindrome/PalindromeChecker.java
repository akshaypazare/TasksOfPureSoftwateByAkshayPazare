package com.PureSoftware.Tasks.Palindrome;

public class PalindromeChecker {

    public static boolean checkPalindrome(String string) {

        String cleanString = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = cleanString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanString.charAt(i) != cleanString.charAt(length - 1 - i)) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "radar3";
        if (checkPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }


    }
}
