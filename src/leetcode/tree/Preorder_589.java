package leetcode.tree;

import java.util.LinkedList;
import java.util.List;

public class Preorder_589 {
    public List<Integer> preorder(Node root) {
        List<Integer> l = new LinkedList<>();


       // recursion(l,root);
        return l;
    }

    private void recursion(List l, Node n){
        if(n == null){
            return;
        }
        l.add(n.val);
        for(int i = 0;i < n.children.size();i++){
            recursion(l,n.children.get(i));
        }
    }


    private void recursion1(List l, Node n){
        if(n == null){
            return;
        }

        for(int i = n.children.size() - 1;i >= 0 ;i--){
            recursion1(l,n.children.get(i));
        }
        l.add(n.val);
    }
}
