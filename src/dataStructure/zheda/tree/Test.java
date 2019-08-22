package dataStructure.zheda.tree;

public class Test {
    public static void main(String[] args) {
        BinTree binTree = new BinTree(1);
        binTree.setL(new BinTree(2));
        binTree.setR(new BinTree(3));
        binTree.getL().setL(new BinTree(4));
        binTree.getR().setR(new BinTree(5));
        PreOrder.recursionTraversal(binTree);

        System.out.println("==================================InOrder====================================");
        InOrderTraversal.inorderTraveral(binTree);

        System.out.println("=================================PostOrder===================================");
        PostOrder.postOrder(binTree);


        System.out.println("==============================   LevelTraversal==============================");
        LevelTraversal.levelTraversal(binTree);

        System.out.println(TreeHeight.getHeight(binTree));
    }

}
