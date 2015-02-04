// Pow(x,n)
// https://oj.leetcode.com/problems/powx-n/
class Solution {
public:
    double pow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        if (n % 2 != 0)
            return x * pow(x, n-1);
        return pow(x * x, n/2);
    }
};