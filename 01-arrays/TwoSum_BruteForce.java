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
// Brute Force Solution
// ------------------------------
import java.util.Arrays;
public class TwoSum_BruteForce{
    public static int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++){
        for (int j = i + 1; j < nums.length; j++){
            if (nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
        }
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
