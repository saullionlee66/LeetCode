package ValidAnagram242;
/*
EASY
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
*/

import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        //if the two strings length are different, false instantly
        //Use a map to store characters and frequency of the character
        HashMap<Character, Integer> hm1 = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++){
            if(hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i), hm1.get(s.charAt(i)) + 1);
            }else hm1.put(s.charAt(i),1);
        }

        for(int j = 0; j < t.length(); j++){
            if(hm1.containsKey(t.charAt(j)) && hm1.get(t.charAt(j)) > 0) {
                hm1.put(t.charAt(j), hm1.get(t.charAt(j)) - 1);
            }else{
                return false;
            }
        }

        return true;
    }
}
