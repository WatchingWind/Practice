package dataStructure.zheda.tree;

public class PostOrder {
    public static void postOrder(BinTree binTree ) {
        if(binTree != null ) {
            postOrder(binTree.getL());
            postOrder(binTree.getR());
            System.out.println(binTree.getData());
        }
    }

}
