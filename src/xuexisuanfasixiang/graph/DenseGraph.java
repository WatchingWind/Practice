package xuexisuanfasixiang.graph;

import java.util.Vector;

public class DenseGraph {
    private int n , m;//n ：图的大小    m ：图的边
    private boolean directed;

    private Vector<Vector<Boolean>> g;

    public DenseGraph(int n, boolean directed){
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

        if( hasEdge(v, w)){
            return;
        }
        g.get(v).set(w, true);

        if(! directed){
            if( hasEdge(v, w)){
                return;
            }

            g.get(w).set(v, true);
        }

        m ++;
    }

    private boolean hasEdge(int v, int w){
        assert (v >= 0 && v < n);
        assert (w >= 0 && w < n);

        return g.get(v).get(w);
    }
}
