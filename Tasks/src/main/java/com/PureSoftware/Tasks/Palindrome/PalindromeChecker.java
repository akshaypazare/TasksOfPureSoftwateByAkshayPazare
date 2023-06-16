package com.PureSoftware.Tasks.Palindrome;

public class PalindromeChecker {

    public static String checkPalindrome(String string) {

        String cleanString = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = cleanString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanString.charAt(i) != cleanString.charAt(length - 1 - i)) {

                return string + " is not palindrome.";
            }
        }

        return string + " is a palindrome.";
    }


}