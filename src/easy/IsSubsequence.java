package easy;

public class IsSubsequence {

    // Leetcode 392.

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence subsequence = new IsSubsequence();
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(subsequence.isSubsequence(s, t));
    }
}
