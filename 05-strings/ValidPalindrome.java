/*
================================================

LeetCode #125 - Valid Palindrome

Problem:

Given a string s, determine whether it is a
palindrome after converting all uppercase letters
into lowercase letters and removing all
non-alphanumeric characters.

A palindrome reads the same forward and backward.

Return true if the string is a palindrome,
otherwise return false.

Topic     : Strings + Two Pointers

================================================
*/

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left <= right){
            char fchar = s.charAt(left);
            char lchar = s.charAt(right);

            if (!Character.isLetterOrDigit(fchar)){
                left++;
            }
            else if (!Character.isLetterOrDigit(lchar)){
                right--;
            }
            else{
                if (Character.toLowerCase(fchar) != Character.toLowerCase(lchar)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));
    }
}

/*
Approach: Two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/