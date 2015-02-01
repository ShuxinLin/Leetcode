// Longest Substring without Repeating Characters
// https://oj.leetcode.com/problems/longest-substring-without-repeating-characters/
/*
Given a string, find the length of the longest substring without repeating characters.
*/
public class Solution {

    public int lengthOfLongestSubstring(String str) {
        int maxlen = 0;
        
        int s = 0, e = 0;
        
        boolean[] chars = new boolean[256];
        
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (chars[(int)c]){
                // char exists
                maxlen = Math.max(maxlen, e-s);
                
                // move s to [first occurrence of c]+1.
                while(str.charAt(s) != c){
                    chars[(int)str.charAt(s)] = false;
                    s++;
                }
                
                s += 1;
                e++;
            } else {
                // not in substr, move forward
                chars[(int)c] = true;
                e++;
            }
        }
        maxlen = Math.max(maxlen, str.length()-s);
        return maxlen;
    }
}