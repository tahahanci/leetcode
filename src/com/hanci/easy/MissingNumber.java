package com.hanci.easy;

public class MissingNumber {

    // Leetcode 268.

    public int missingNumber(int[] nums) {
        int actualSum = (nums.length * (nums.length + 1)) / 2;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
        }

        return actualSum - currentSum;
    }
}
