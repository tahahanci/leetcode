package medium;

import java.util.Arrays;

public class TwoSumII {

    // Leetcode 167.

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int current = numbers[left] + numbers[right];

            if (current == target) {
                return new int[] {left + 1, right + 1};
            }

            if (current > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int[] numbers = {2,7,11,15};

        System.out.println(Arrays.toString(twoSumII.twoSum(numbers, 9)));
    }
}
