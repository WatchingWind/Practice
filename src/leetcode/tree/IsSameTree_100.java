package leetcode.tree;


public class IsSameTree_100 {




    public boolean isSameTree(TreeNode p, TreeNode q) {
       return compareTree(p,q);
    }

    private boolean compareTree(TreeNode p, TreeNode q) {
       if(p == null && q == null){
           return true;
       }
       if(p == null || q == null){
           return false;
       }
        if (p.val != q.val){
            return false;
        }

        boolean resL = compareTree(p.left,q.left);
        boolean resR = compareTree(p.right,q.right);

        return resL && resR;
    }
}
