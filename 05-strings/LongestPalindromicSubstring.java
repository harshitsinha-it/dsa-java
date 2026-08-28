/*
=====================================================
LeetCode #5 - Longest Palindromic Substring

Problem:

Given a string s, return the longest palindromic 
substring in s.

Topic      : Strings
Approach: Expand Around Center
=====================================================
*/

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s){
        if (s.length() == 0){
            return "";
        }
        String result = "";
        for (int i = 0; i < s.length(); i++){
            String odd = expand(s, i, i);
            String even = expand(s, i, i + 1);
            if (odd.length() > result.length()){
                result = odd;
            }
            if (even.length() > result.length()){
                result = even;
            }
        }
        return result;
    }
    private static String expand(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
    public static void main(String args[]){
        String s = "ababad";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
