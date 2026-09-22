/*=====================================================
LeetCode #14 - Longest Common Prefix

Problem:

Write a function to find the longest common prefix 
string amongst an array of strings. If there is no 
common prefix, return an empty string "".

Topic      : Strings
Approach: Character-by-character comparison against first string
=====================================================
*/
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
        for (int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            for (int j = 1; j < strs.length; j++){
                String compare = strs[j];
                if (i >= compare.length()){
                    return prefix.substring(0,i);
                }
                char ch = compare.charAt(i);
                if (c == ch){
                    continue;
                }
                else{
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String[] arr = {"flower", "flight", "flow"};
        String str = longestCommonPrefix(arr);
        System.out.println("Common prefix = " +str);
    }
}
/*
Time Complexity: O(n*m)  -> n = Number of String; m = Length of shortest String
Space Complexity: O(1)
*/