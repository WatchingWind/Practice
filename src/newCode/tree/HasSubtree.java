package newCode.tree;

public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
      if(root1 == null || root2 == null){
          return false;
      }

      return isSameTree(root1,root2) || isSameTree(root1.left,root2) || isSameTree(root1.right,root2);
    }

    public boolean isSameTree(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 != null && root2 == null){
            return true;
        }
        if(root1 == null && root2 != null){
            return false;
        }
        if(root1.val != root2.val){
            return  false;
        }
        boolean l = isSameTree(root1.left,root2.left);
        boolean r = isSameTree(root1.right,root2.right);

        return l && r;
    }


}
