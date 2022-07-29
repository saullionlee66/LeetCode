package TwoPointers.ValidPalindrome125;
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class Solution {
    //write a helper function to determine if it's letters or numbers
    public boolean isAlphaNum(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9' )) return true;
        return false;
    }

    //use two pointers, check each letter from both ends of the string
    //only if it's alphanumeric, compare it after change it to lowercase
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            //if the letter is not alphanum, keep moving the pointer
            while(left < right && !isAlphaNum(s.charAt(left))) left++;
            while(left < right && !isAlphaNum(s.charAt(right))) right--;
            if(isAlphaNum(s.charAt(left)) && isAlphaNum(s.charAt(right))){
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
