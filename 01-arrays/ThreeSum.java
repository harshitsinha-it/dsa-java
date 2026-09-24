/*
=====================================================
LeetCode #15 - 3Sum

Problem:
Given an integer array nums, return all the triplets
[nums[i], nums[j], nums[k]] such that i != j, i != k,
and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate
triplets.
Example:1) nums = [-1, 0, 1, 2, -1, -4]
           Output = [[-1, -1, 2], [-1, 0, 1]]
        2) nums = [1, 2, 0, 1, 0, 0, 0, 0]
           Output = [[0, 0, 0]]

Topic      : Array + Two Pointer
Approach: Sort + Fix one element + Two Pointer for the remaining pair
=====================================================
*/

import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> threeSum (int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i -1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else if (nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
                else{
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    ans.add(triplet);
                    left++;
                    right--;
                    //duplicate checking
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while ( left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] test1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(test1);
        System.out.println(result);
        int[] test2 = {1, 2, 0, 1, 0, 0, 0, 0};
        System.out.println(threeSum(test2));
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1) extra (excluding output list)
*/