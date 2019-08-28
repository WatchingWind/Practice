package leetcode.tree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int i = maxDepth(root.right);
        int j = maxDepth(root.left);

        return (i > j ? i : j) + 1 ;
    }
}
