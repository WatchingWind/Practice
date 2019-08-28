package leetcode.tree;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode cur = root;
        while(true){
            if(cur == null){
                return null;
            }
            if(cur.val == val){
                return cur;
            }else if(cur.val > val){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
    }
}
