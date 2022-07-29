package SlidingWindow.PermutationinString567;

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
 */
public class Solution1 {
    public boolean checkInclusion(String s1, String s2) {
        //A trick to make it O(n), or O(26) + O(n)
        //store s1 and s2's character frequency in two arrays
        //use a match number, if the window matches, the match number should be 26 as 26 characters totally
        //sliding window will move. When right move forward, if the character matches, plus one, else minus one.
        //also, left will move forward, if the character already matched, minus one, else plus one
        if(s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int left = 0;
        int match = 0;
        //first check s1 length
        for(int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        //the slot is 0 default
        for(int i = 0; i < 26; i++ ){
            if(s1Count[i] == s2Count[i]) match++;
        }
        //s1 length - 1 has been checked, start from s1.length;
        for(int i = s1.length(); i < s2.length(); i++){
            if(match == 26) return true;

            int index = s2.charAt(i) - 'a';
            s2Count[index]++;
            if(s1Count[index] == s2Count[index]) match++;
            else if(s1Count[index] + 1 == s2Count[index]) match--;

            index = s2.charAt(left) - 'a';
            s2Count[index]--;
            if(s1Count[index] == s2Count[index]) match++;
            else if(s1Count[index] - 1 == s2Count[index])  match--;
            left++;
        }
        return match == 26;
    }
}
