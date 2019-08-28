package leetcode.tree;

public class InvertTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null ){
            return null;
        }
        //本题的解题思路是翻转所有的的节点的左右节点
        TreeNode left  = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    /*private void invert(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return;
        }else if(p ==null || q ==null){

        } else{
            int temp = p.val;
            p.val = q.val;
            q.val = temp;
        }
        invert(p.left,q.right);
        invert(p.right,q.left);
    }*/

}
