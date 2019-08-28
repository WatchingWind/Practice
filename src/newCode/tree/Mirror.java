package newCode.tree;

public class Mirror {




    public void Mirror(TreeNode root) {
        reverse(root);
    }

    private TreeNode reverse(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode l = reverse(root.left);
        TreeNode r = reverse(root.right);
        root.left = r;
        root.right = l;
        return root;
    }
}
