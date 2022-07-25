package TwoSum1;

import java.util.HashMap;

/*
EASY
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int [] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = hm.get(target - nums[i]);
            }else{
                hm.put(nums[i], i);
            }
        }
        return result;
    }
}
