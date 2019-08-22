package dataStructure.zheda.tree;

import java.math.BigDecimal;

public class BinTree {
    private int data;
    private BinTree l;
    private BinTree r;

    public BinTree(){

    }
    public BinTree(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinTree getL() {
        return l;
    }

    public void setL(BinTree l) {
        this.l = l;
    }

    public BinTree getR() {
        return r;
    }

    public void setR(BinTree r) {
        this.r = r;
    }
}
