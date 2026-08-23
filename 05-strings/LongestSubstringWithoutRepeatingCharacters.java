/*
==================================================
LeetCode #3 - LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS

Topic: Strings + HashSet + Sliding Window

Problem Statement:
Given a string s, find the length of the longest substring
without repeating characters.

Example:
Input: s = "abcabcbb"
Output: 3
==================================================
*/

import java.util.HashSet;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
        int left = 0;
        int maxLength = 0;
        HashSet <Character> set = new HashSet <>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            if (maxLength < set.size()){
                maxLength = set.size();
            } 
        }
        return maxLength;
    }
    public static void main(String args[]){
        String s = "abcabcabcbb";
        String t = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(t));
    }
}

/*
Time Complexity: O(n)

Space Complexity: O(n)
The HashSet can store up to n characters in the worst case.
*/
