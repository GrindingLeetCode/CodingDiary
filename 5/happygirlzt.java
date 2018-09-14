/**
 *LeetCode #5. Longest Palindromic Substring
 *Created on 13 Sep 2018
 */

public class LongestPalindromicSubstring {
    // TLE recursive try
    public String longestPalindrome(String s) {
        String res = "";
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j - i > len; j--) {
                if (j - i > len && isPalindrome(s.substring(i, j))) {
                    len = j - i;
                    res = s.substring(i, j);
                }
            }
        }

        return res;
    }

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            int first = 0;
            int last = s.length();
            if (s.charAt(first) == s.charAt(last - 1)) {
                return isPalindrome(s.substring(first + 1, last - 1));
            } else {
                return false;
            }
        }
    }
}
