package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> integers = new ArrayList<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                integers.add(num);
            }
        }

        return integers;
    }

    public static void main(String[] args) {
        FindAllDuplicates findAllDuplicates = new FindAllDuplicates();
        int[] numbers = {4,3,2,7,8,2,3,1};

        System.out.println(findAllDuplicates.findDuplicates(numbers));
    }
}
