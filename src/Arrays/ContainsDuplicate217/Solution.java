package Arrays.ContainsDuplicate217;
/*
EASY
Given an integer array nums,
return true if any value appears at least twice in the array,
and return false if every element is distinct
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        //use set
        Set<Integer> mySet = new HashSet<>();
        for(int i : nums){
            if(mySet.contains(i)) return true;
            else mySet.add(i);
        }
        return false;
    }
}
