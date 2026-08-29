/*
=====================================================
LeetCode #8 - String to Integer (atoi)

Problem:

Implement the myAtoi(string s) function, which converts 
a string to a 32-bit signed integer.

The algorithm is as follows:
1. Read in and ignore any leading whitespace.
2. Check if the next character is '-' or '+', 
   read it if so.
3. Read in next characters until a non-digit character 
   or end of input is reached. Convert digits into an integer.
4. If the integer is out of the 32-bit signed integer range, 
   clamp it to that range.

Topic      : Strings
Approach: Simulation (skip spaces, check sign, collect digits, handle overflow)
=====================================================
*/

public class StringToInteger {
    public static int myAtoi(String s){
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if (s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        long result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))){
            result = result * 10 + (s.charAt(i) - '0');
            i++;

            //In Case of Overflow:-
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(sign * result);
    }
    public static void main(String args[]){
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("     -42"));
        System.out.println(myAtoi("4136 without words"));
        System.out.println(myAtoi("-977146382726"));
        System.out.println(myAtoi("+-12"));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/