package newCode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        ArrayList<Integer> vals= new ArrayList<>();
        ArrayList<TreeNode>  nodes = new ArrayList<>();

        nodes.add(root);
        int index = 0;

        while(true){


            if(index == nodes.size()){
                break;
            }

            vals.add(nodes.get(index).val);
            if(nodes.get(index).left != null){
                nodes.add(nodes.get(index).left);
            }
            if(nodes.get(index).right != null){
                nodes.add(nodes.get(index).right);
            }

            index++;
        }

        return vals;
    }
}
