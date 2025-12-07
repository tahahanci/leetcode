package com.hanci.easy;

public class OddNumbersInIntervalRange {

    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
