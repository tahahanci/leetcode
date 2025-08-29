package easy;

import java.util.ArrayList;
import java.util.List;

public class CombineArray {

    public List<Integer> combine(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            ans.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            ans.add(arr2[j]);
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        CombineArray combineArray = new CombineArray();
        int[] number1 = {1, 3, 6, 12};
        int[] number2 = {-3, -1, 4, 14};

        System.out.println(combineArray.combine(number1, number2));
    }
}
