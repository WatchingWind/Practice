package dataStructure.zheda.tree;

public class TreeHeight {
    public static int getHeight(BinTree binTree ) {
        if(binTree != null){
            int lH = getHeight((binTree.getL()));
            int rH = getHeight(binTree.getR());

            return Math.max(lH, rH) + 1;
        }

        return 0;
    }
}
