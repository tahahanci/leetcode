package com.hanci.medium;

public class TwoSumII {

    /**
     * Finds two numbers in a sorted (non-decreasing) array that add up to the given target and
     * returns their 1-based indices as required by LeetCode 167.
     *
     * <p>This implementation uses the two-pointer technique: one pointer starts at the beginning
     * of the array (left) and the other at the end (right). Move the left pointer forward when
     * the current sum is less than the target, or move the right pointer backward when the
     * current sum is greater than the target. When the two values sum to the target, their
     * 1-based indices are returned.
     *
     * <p>Time complexity: O(n). Space complexity: O(1).
     *
     * @param numbers a sorted array of integers (must not be null)
     * @param target the target sum to find
     * @return a length-2 int array containing the 1-based indices of the two numbers whose
     *         sum equals {@code target}; returns {@code {-1, -1}} if no such pair exists
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[] {left + 1, right + 1};
            }
        }

        return new int[] {-1, -1};
    }
}
