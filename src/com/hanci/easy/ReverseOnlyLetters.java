package com.hanci.easy;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        int left = 0, right = s.length() - 1;
        char[] characters = s.toCharArray();

        while (left < right) {
            if (!Character.isLetter(characters[left])) {
                left++;
            } else if (!Character.isLetter(characters[right])) {
                right--;
            } else {
                char temp = characters[left];
                characters[left++] = characters[right];
                characters[right--] = temp;
            }
        }

        return new String(characters);
    }
}
