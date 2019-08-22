package dataStructure.zheda.tree;

public class InOrderTraversal {
    public static void inorderTraveral(BinTree binTree){
        if(binTree != null){
            inorderTraveral(binTree.getL());
            System.out.println(binTree.getData());
            inorderTraveral(binTree.getR());
        }
    }
}
