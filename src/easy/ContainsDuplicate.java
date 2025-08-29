package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // Leetcode 217.

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            if (!integerSet.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] numbers = {1, 2, 3, 4, 9, 9};

        System.out.println(duplicate.containsDuplicate(numbers));
    }
}
