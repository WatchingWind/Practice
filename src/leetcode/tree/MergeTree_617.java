package leetcode.tree;

public class MergeTree_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }
        if(t1 == null || t2 == null){
            return t1 == null ? t2 : t1;
        }

        //已经保证了 t1及 t2 不为null
       return merge(t1,t2);
    }

    private TreeNode merge(TreeNode t1, TreeNode t2) {
        TreeNode mergeNode;
        if(t1 == null && t2 == null){
            return null;

        } else if(t1 == null || t2 == null){
            mergeNode = t1 == null ? t2 : t1;

        } else{
            mergeNode = new TreeNode(t1.val + t2.val);
            mergeNode.left = merge(t1.left,t2.left);
            mergeNode.right = merge(t1.right,t2.right);
        }
        return mergeNode;
    }
}
