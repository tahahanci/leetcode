package com.hanci.easy;

public class AddDigits {

    public int addDigits(int num) {
        if (num < 10) return num;
        int remainder = num % 9;
        return remainder == 0 ? 9 : remainder;
    }
}
