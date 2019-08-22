package dataStructure.zheda.tree;

public class ReConstructBinTree {
    public static BinTree reConstructBinaryTree(int[] pre, int[] in){
        BinTree binTree = new BinTree();

       binTree =  reConstructBinaryTree(pre,0,pre.length - 1, in, 0, in.length - 1 );
       return binTree;
    }

    private static  BinTree reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn){
        for(int i = startIn; i <= endIn; i++ ) {
            if(in[i] == pre[startIn] ) {
                //reConstructBinaryTree(pre,startIn + 1);
            }
        }

        return new BinTree();
    }
}
