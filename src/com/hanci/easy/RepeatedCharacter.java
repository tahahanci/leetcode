package com.hanci.easy;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {

    // Leetcode 2351.

    public char findRepeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (seen.contains(s.charAt(i))) {
                return s.charAt(i);
            }

            seen.add(s.charAt(i));
        }

        return ' ';
    }
}
