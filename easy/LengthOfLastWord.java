// length of last word
// https://oj.leetcode.com/problems/length-of-last-word/
/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
return the length of last word in the string
If the last word does not exist, return 0.
*/
public class Solution {
    public int lengthOfLastWord(String s) {
        int wlen = 0, prevwlen = 0;
        boolean wasprevspace = false;
        for(int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == ' ') {
                if (!wasprevspace){
                    prevwlen = wlen;
                    wlen = 0;
                    wasprevspace = true;
                }
            } else {
                wlen++;
                prevwlen=0;
                wasprevspace = false;
            }
        }       
        return Math.max(prevwlen, wlen);
    }
}