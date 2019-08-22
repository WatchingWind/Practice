package dataStructure.zheda.tree;

import java.util.Stack;

public class PreOrder {
    public static void recursionTraversal(BinTree binTree){
      /*  if(binTree.getL() != null){
            recursionTraversal(binTree.getL());
            System.out.println(binTree.getData());
            recursionTraversal(binTree.getR());
        }else{
            System.out.println(binTree.getData());
            recursionTraversal(binTree.getR());
        }*/
      if(binTree != null){
          System.out.println(binTree.getData());
          recursionTraversal(binTree.getL());
          recursionTraversal(binTree.getR());
      }

    }

    public static <T extends BinTree>void stackTraversal(T binTree ) {
        if(binTree == null ){
            return ;
        }
        Stack<T>  stack = new Stack<>();
        T cur ;
        while(true){
            System.out.println(binTree.getData());
            if(binTree.getL() != null ) {
                stack.push(binTree);
                cur = (T) binTree.getL();
            }else if (binTree.getL() == null ) {
                cur = stack.peek();
                if(cur.getL() == null && cur.getR() == null){
                    System.out.println(stack.pop().getData());
                }
            }


            if(stack.size() == 0 ){
                break;
            }

        }

    }

}
