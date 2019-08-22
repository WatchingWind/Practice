package dataStructure.zheda.tree;

import java.util.PriorityQueue;
import java.util.Queue;

public class LevelTraversal {

    public static  void levelTraversal(BinTree binTree ) {
        if(binTree == null ) {
            return ;
        }
        MyQueue<BinTree> myQueue = new MyQueue(10);
        myQueue.add(binTree);
        BinTree last = binTree;
        BinTree nLast = null;
        while(myQueue.size > 0){
            BinTree cur = (BinTree) myQueue.pop();
            if(cur.getL() != null ){
                nLast = cur.getL();
            }
            if(cur.getR() != null ) {
                nLast = cur.getR();
            }

            System.out.println(cur.getData());
            if(cur == last){
                System.out.println("==============");
                last = nLast;
                nLast = null;
            }
            if(cur.getL() != null ) {
                myQueue.add(cur.getL());
            }
            if(cur.getR() != null ) {
                myQueue.add(cur.getR());
            }
        }
    }

}
