package Stack.ValidParentheses20;

import java.util.Stack;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
public class Solution {
    public boolean isValid(String s){
        //use stack to pop out after checking
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else if(c ==')' && !stack.isEmpty() && (stack.peek() == '(')) stack.pop();
            else if(c =='}' && !stack.isEmpty() && (stack.peek() == '{') ) stack.pop();
            else if(c ==']' && !stack.isEmpty() && (stack.peek() == '[') ) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
