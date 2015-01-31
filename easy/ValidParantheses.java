// Valid parantheses
// https://oj.leetcode.com/problems/valid-parentheses/
/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
public class Solution {
    public boolean isValid(String s) {
        if (s == null) return true;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : s.toCharArray()){
            if (c=='(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char p = stack.pop();
                if (c == ']' && p != '[') return false;
                else if (c == ')' && p != '(') return false;
                else if (c == '}' && p != '{') return false;
            }
        }
        
        return stack.isEmpty();
    }
}