package com.hanci.easy;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    // Leetcode 1832.

    public boolean checkIfPangram(String sentence) {
        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            characters.add(sentence.charAt(i));
        }

        return characters.size() == 26;
    }
}
