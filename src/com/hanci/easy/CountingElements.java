package com.hanci.easy;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public int countElements(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        int counter = 0;

        for (int num : arr) {
            seen.add(num);
        }

        for (int j : arr) {
            if (seen.contains(j + 1)) {
                counter++;
            }
        }

        return counter;
    }
}
