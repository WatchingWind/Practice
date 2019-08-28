package leetcode.tree;

public class RangeSumBST_938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        return getStepSum(root, L, R);
    }

    private int getStepSum(TreeNode node,int l,int r){
        if(node == null){
            return 0;
        }

        if(node.val >= l &&  node.val <= r){

          return node.val
                  + getStepSum(node.left,l,r)
                  + getStepSum(node.right,l,r);
        }else if (node.val < l){
            return getStepSum(node.right,l,r);

        }else {
            return getStepSum(node.left,l,r);
        }
    }
}
