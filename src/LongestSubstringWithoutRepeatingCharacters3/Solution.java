package LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s, find the length of the longest substring without repeating characters.

 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        //sliding window
        //use a set, if the right is not in the set, add it, then move right
        //else left need to move right and remove the letter from the set
        if(s.length() == 0) return 0;
        int left = 0; int right = 0;
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int maxL = 0;
        while(right < len){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
            maxL = Math.max(maxL, set.size());
        }
        return maxL;
    }
}
