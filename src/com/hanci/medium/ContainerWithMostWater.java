package com.hanci.medium;

public class ContainerWithMostWater {

    /**
     * Computes the maximum water container area that can be formed between two lines in the
     * input array.
     *
     * @param heights an array of non-negative integers where each element represents the height of
     *                a vertical line at that index. Must not be null. If the array has fewer than
     *                two elements the result is {@code 0} (no container can be formed) — this is
     *                checked explicitly by the method.
     * @return the maximum area (height * width) that can be contained between two lines. Returns
     *         {@code 0} when {@code heights.length < 2}.
     * Time complexity: O(n) where n = heights.length. The algorithm advances one of the two
     * pointers on each step and examines each element at most once.
     * Space complexity: O(1) additional space.
     */
    public int maxArea(int[] heights) {
        if (heights == null) {
            throw new NullPointerException("heights must not be null");
        }

        if (heights.length < 2) {
            return 0;
        }

        int left = 0, right = heights.length - 1;
        int maximumArea = 0;

        while (left < right) {
            int currentArea;
            if (heights[left] < heights[right]) {
                currentArea = heights[left] * (right - left);
                left++;
            } else {
                currentArea = heights[right] * (right - left);
                right--;
            }
            maximumArea = Math.max(maximumArea, currentArea);
        }

        return maximumArea;
    }
}
