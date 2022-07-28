package threeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        //Can be converted into twoSum II after sort the input array
        //One number's negate is the target, find the other two numbers
        //Some edge cases need to consider
        //Since there's no duplicated triplets, after finding a triplet, need to ensure the next pointer value is different
        List<List<Integer>> finalResult = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            //edge case, no need to check two consecutive same value number
            if(i == 0 || nums[i] != nums[i - 1]){
                int target = -nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while(left < right){
                    if(nums[left] + nums[right] == target){
                        //found the triplet, add it into a list,then add the list into the final result list
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[left]);
                        result.add(nums[right]);
                        finalResult.add(result);
                        //There might be some other triplets
                        //need to make sure the pointers pointing to some other value number
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        right--;
                        left++;
                    }
                    else if(nums[left] + nums[right] > target) right--;
                    else left++;
                }
            }
        }
        return finalResult;
    }
}
