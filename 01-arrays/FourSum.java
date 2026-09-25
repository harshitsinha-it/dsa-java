/*
=====================================================
LeetCode #18 - 4Sum

Problem:

Given an array nums of n integers, return an array of
all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]]
such that a, b, c, and d are distinct, and
nums[a] + nums[b] + nums[c] + nums[d] == target.
Example 1: nums = [1,0,-1,0,-2,2], target = 0
           Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2: nums = [2,2,2,2,2], target = 8
           Output: [[2,2,2,2]]

Topic      : Array + Two Pointer
Approach: Sort + Fix two elements + Two Pointer for the remaining pair
=====================================================
*/

import java.util.*;
public class FourSum {
    public static List<List<Integer>> fourSum (int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList <>();
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for (int j = i + 1; j < nums.length; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target){
                        left++;
                    }
                    else if (sum > target){
                        right--;
                    }
                    else{
                        List<Integer> quadruplets = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        ans.add(quadruplets);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]){
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]){
                            right--;
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = fourSum(arr1, 0);
        System.out.println(result);
    }
}

/*
Time Complexity: O(n^3)
Space Complexity: O(1) extra (excluding output list)
*/