package leetcode.tree;

import wanzhuanshujujiegou.tree.Node;

public class IsSymmetric_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return judge(root.left, root.right);
    }
    private boolean judge(TreeNode node1,TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        if (node1.val != node2.val){
            return false;
        }
        boolean res1 = judge(node1.left, node2.right);
        boolean res2 = judge(node1.right,node2.left);

        return res1 && res2;
    }
}
