package wanzhuanshujujiegou.tree;

public class SegmentTree <E>{
    private E[] data;
    private E[] tree;
    Merge<? super E> merger ;

    public SegmentTree(E[] arr,Merge<? super E> merge){
        this.merger = merge;
        data = (E[]) new Object[arr.length];
        for(int i = 0; i < arr.length; i++ ) {
            data[i] = arr[i];
        }
        tree = (E[]) new Object[4 * arr.length];

        buildSegmentTree(0,0,data.length - 1);
    }

    private void buildSegmentTree(int treeIndex, int l, int r) {
        if(l == r ) {
            tree[treeIndex] = data[l];
            return;
        }

        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);

        int mid = l + ( r - l) /2;
        buildSegmentTree(leftTreeIndex, l, mid);
        buildSegmentTree(rightTreeIndex, mid + 1, r);

        tree[treeIndex] = (E)merger.merge(tree[leftTreeIndex],tree[rightTreeIndex]);
    }

    public E get(int index){
        if(index < 0 || index >= data.length ) {
            throw new RuntimeException("index is illegal");
        }
        return data[index];
    }

    public int size(){
        return data.length;
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private  int rightChild(int index){
        return 2 * index + 2;
    }
}
