// Largest Rectangle in Histogram
// https://oj.leetcode.com/problems/largest-rectangle-in-histogram/
public class Solution {
    public int largestRectangleArea(int[] height) {
        int maxArea = 0;
        
        int prevVal = -1;
        boolean wasLastMax = false;
        for(int i = 0; i < height.length; i++){
            int val = height[i];
            
            if (wasLastMax && val == prevVal){
                prevVal = val;
                continue;
            }
            
            int gtOrEqOnLeft = 0,  gtOrEqOnRight = 0;
            for(int k = i-1; k >= 0; k--)
                if (height[k] >= val)
                    gtOrEqOnLeft++;
                else break;
            for(int k = i+1; k < height.length; k++)
                if (height[k] >= val)
                    gtOrEqOnRight++;
                else break;
            
            int area = (gtOrEqOnLeft + gtOrEqOnRight + 1 /* self */) * val;
            
            if (area > maxArea){
                maxArea = area;
                wasLastMax = true;
            } else {
                wasLastMax = false;
            }
            prevVal = val;
        }
        return maxArea;
    }
}