/*
================================================

LeetCode #242 - Valid Anagram

Problem:

Given two strings s and t, return true if t is
an anagram of s, and false otherwise.

An anagram is a word or phrase formed by
rearranging the letters of another word using
all the original letters exactly once.

Topic     : Strings + Hashing + Arrays

================================================
*/

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++){
            if (count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}

/* 
Approach we use: Frequency Array

Since the problem contains only lowercase English
letters, we use an array of size 26.

Time Complexity: O(n)
Space Complexity: O(1)
*/
