package PermutationinString567;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution2 {
    public boolean checkInclusion(String s1, String s2){
        //use Array.equals to determine found or not
        //sliding window, right move forward, plus one. Left move forward, minus one.

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            if(Arrays.equals(s1Count, s2Count)) return true;

            s2Count[s2.charAt(i)- 'a']++;
            s2Count[s2.charAt(i - s1.length()) - 'a']--;
        }
        return Arrays.equals(s1Count,s2Count);
    }
}
