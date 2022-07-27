package ProductofArrayExceptSelf238;
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class Solution {
    //every result position is actually the product of all elements from the prefix and postfix
    //so, need to calculate teh prefix and postfix product - loop the nums array twice, so time complexity is O(n)
    //For space complexity, since using the result array doesn't count as extra space, it's O(1)
    //use the result array to store the prefix, then calculate the postfix to store into the result array again,
    //just multiply the already exiting prefix value, it's the final result
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //for the first element, consider the prefix is 1
        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }
        //for the last element, consider the postfix is 1 as well
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}
