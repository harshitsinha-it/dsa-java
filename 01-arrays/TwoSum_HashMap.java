/*
========================================================
LeetCode #1 - Two Sum

Problem:
Given an integer array nums and a target,
return the indices of two numbers whose sum equals the target.

Topic      : Arrays + HashMap
Difficulty : Easy
========================================================
*/
// ------------------------------
// HashMap Solution
// ------------------------------
import java.util.HashMap;
import java.util.Arrays;
public class TwoSum_HashMap{
    public static int[] twoSum(int[] nums, int target) {
       HashMap <Integer,Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++){
        int need = target - nums[i];
        if (map.containsKey(need)){
            return new int[]{map.get(need),i};
        }
        map.put(nums[i],i);
       }   
       return new int[]{};
    }
    public static void main(String args[]){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.print("Indices are: " +Arrays.toString(ans));
    }
}
