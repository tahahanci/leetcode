package easy;

import java.util.Arrays;

public class ReverseString {

    // Leetcode 344.

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            if (s[left] != s[right]) {
                char temp = s[left];
                s[left++] = s[right];
                s[right--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(Arrays.toString(s));
        reverse.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
