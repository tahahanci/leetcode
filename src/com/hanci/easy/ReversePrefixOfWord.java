package com.hanci.easy;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        int left = 0, right = word.indexOf(ch);
        char[] characters = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        while (left < right) {
            char temp = characters[left];
            characters[left++] = characters[right];
            characters[right--] = temp;
        }

        for (char c : characters) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
