/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
 // Minimum Depth of Binary Tree
// https://leetcode.com/problems/minimum-depth-of-binary-tree/
class Solution {
public:
    int minDepth(TreeNode *root) {
        if (!root) return 0;
        if (!root->left && !root->right)
            return 1;
        
        if (!root->left) return minDepth(root->right) + 1;
        if (!root->right) return minDepth(root->left) + 1;
        return min(minDepth(root->left), minDepth(root->right))+1;
    }
};