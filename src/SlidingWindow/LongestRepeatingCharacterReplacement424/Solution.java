package SlidingWindow.LongestRepeatingCharacterReplacement424;
/*
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character.
You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.
 */
public class Solution {
    //Sliding window
    //This window needs to be valid if the window length - highest frequent number of letter <= k
    //meaning the k times is enough to change the less frequent character in this window
    //if not valid, the left pointer character's frequency need to be decremented and left pointer move forward
    //right pointer move forward as well to check the next window
    public int characterReplacement(String s, int k){
        int left = 0; int right = 0;
        int[] frequency = new int[26];//use a 26 length array to store each letter's frequency
        int mostFrequent = 0;
        int maxL = 0;
        while(right < s.length()){
            int currentLetterFrequency = frequency[s.charAt(right) - 'A'];
            currentLetterFrequency++;
            mostFrequent = Math.max(mostFrequent, currentLetterFrequency);
            int length = right - left + 1;
            if (length - mostFrequent <= k) {
                right++;
                maxL = Math.max(maxL, length);
            }else{
                frequency[s.charAt(left) - 'A']--;
                left++;
                right++;
            }

        }
        return maxL;
    }

}
