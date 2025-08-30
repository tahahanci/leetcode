package medium;

import java.util.Arrays;

public class BoatsToSavePeople {

    // Leetcode 881.

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        BoatsToSavePeople savePeople = new BoatsToSavePeople();
        int[] people = {3, 2, 2, 1};

        System.out.println(savePeople.numRescueBoats(people, 3));
    }
}
