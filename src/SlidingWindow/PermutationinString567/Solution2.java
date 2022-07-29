package SlidingWindow.PermutationinString567;

import java.util.Arrays;

public class Solution2 {
    public boolean checkInclusion(String s1, String s2){
        //use Array.equals to determine found or not
        //sliding window, right move forward, plus one. Left move forward, minus one.
        if(s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        int left = 0;
        for(int i = s1.length(); i < s2.length(); i++){
            if(Arrays.equals(s1Count, s2Count)) return true;
            //right move forward
            s2Count[s2.charAt(i)- 'a']++;
            //left move forward
            s2Count[s2.charAt(left) - 'a']--;
            left++;
        }
        return Arrays.equals(s1Count,s2Count);
    }
}
