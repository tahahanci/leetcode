package com.hanci.easy;

public class ReverseWordsInAStringIII {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int left = 0, right = words[i].length() - 1;
            char[] characters = words[i].toCharArray();
            while (left < right) {
                char temp = characters[left];
                characters[left++] = characters[right];
                characters[right--] = temp;
            }
            stringBuilder.append(characters);

            if (i < words.length - 1) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }
}
