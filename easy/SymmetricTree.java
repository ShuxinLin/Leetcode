// Symmetric Tree
// https://oj.leetcode.com/problems/symmetric-tree/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode r) {
        if (r == null) return true;
        return isSymmetric(r.left, r.right);
    }
    
    public boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null || q==null) return p==q;
        
        if (p.val != q.val) return false;
        
        return isSymmetric(p.right, q.left) &&  isSymmetric(p.left, q.right);
    }
    
}