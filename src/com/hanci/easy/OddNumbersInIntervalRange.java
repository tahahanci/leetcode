package com.hanci.easy;

public class OddNumbersInIntervalRange {

    /**
     * Counts the number of odd integers in the inclusive range [low, high].
     * This method uses a mathematical formula to calculate the count in O(1) time
     * complexity, avoiding the need to iterate through the range.
     *
     * @param low  the lower bound of the range (inclusive)
     * @param high the upper bound of the range (inclusive)
     * @return the count of odd numbers in the range [low, high]
     * @throws IllegalArgumentException if low > high
     *
     */

    public int countOdds(int low, int high) {
        if (low > high) {
            throw new IllegalArgumentException("low must be less than or equal to high");
        }
        return (high + 1) / 2 - low / 2;
    }
}
