/*
=====================================================
LeetCode #13 - Roman to Integer

Problem:

Roman numerals are represented by seven different 
symbols: I, V, X, L, C, D and M. Given a roman numeral, 
convert it to an integer.

Topic      : Strings + HashMap
Approach: HashMap + Compare current with next
=====================================================
*/

import java.util.HashMap;
public class RomanToInteger {
    public static int romanToInt(String s){
        HashMap <Character, Integer> map = new HashMap <>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++){
            int current = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;
            if (current < next){
                total = total - current;
            }
            else{
                total = total + current;
            }
        }
        return total;
    }
    public static void main(String args[]){
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));   
        System.out.println(romanToInt("MCMXCIV"));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
