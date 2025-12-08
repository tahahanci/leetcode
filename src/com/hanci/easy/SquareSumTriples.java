package com.hanci.easy;

public class SquareSumTriples {

    public int countTriples(int n) {
        int res = 0;

        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int c = (int) Math.sqrt(a * a + b * b + 1);
                if (c <= n && c * c == a * a + b * b) {
                    ++res;
                }
            }
        }

        return res;
    }
}
