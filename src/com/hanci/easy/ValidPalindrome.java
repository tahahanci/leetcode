package com.hanci.easy;

public class ValidPalindrome {

    // Leetcode 125.

    public boolean isPalindrome(String s) {
        String validatedInput = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = validatedInput.length() - 1;

        while (left < right) {
            if (validatedInput.charAt(left) != validatedInput.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
