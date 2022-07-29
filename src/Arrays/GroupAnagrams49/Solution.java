package Arrays.GroupAnagrams49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Medium
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        //return a list of string arrays
        //use a hashmap to store the result and lookup
        //loop the input strs, make each string sorted, to determine if they're the Anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char [] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            //if the map contains the string(sorted), add it to the value - a list of Strings
            //else add it to the map and list
            if(map.containsKey(key)){
                map.get(c).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }

        }
        return new ArrayList<List<String>>(map.values());
    }
}
