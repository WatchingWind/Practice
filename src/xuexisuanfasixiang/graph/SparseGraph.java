package xuexisuanfasixiang.graph;

import java.util.Vector;

public class SparseGraph {
    private int n , m;//n ：图的大小    m ：图的边
    private boolean directed;
    private Vector<Vector<Integer>> g;
    public SparseGraph(int n, boolean directed){
        this.n = n;
        this.m = 0;
        this.directed = directed;
        for(int i = 0; i < n; i++ ) {
            g.add(new Vector<>());
        }
    }

    int V() {
        return n;
    }
    int E() {
        return m;
    }

    public void addedge(int v, int w) {
        assert (v >= 0 && v < n);
        assert (w >= 0 && w < n);

        g.get(v).add(w);

        if(! directed && v != w){
            g.get(w).add(v);
        }
    }

    private boolean hasEdge(int v, int w){
        assert (v >= 0 && v < n);
        assert (w >= 0 && w < n);

        Vector v1 = g.get(v);
        for(int i = 0; i < v1.size(); i++) {
            if((Integer)v1.get(i) == w){
                return true;
            }
        }
        return false;
    }
}
