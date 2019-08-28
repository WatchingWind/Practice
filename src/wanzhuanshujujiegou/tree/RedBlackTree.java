package wanzhuanshujujiegou.tree;

public class RedBlackTree<K,V> {
    public static final boolean RED = true;
    public static final boolean BLACK = false;

    private class Node{
        public K key;
        public V value;
        public boolean color;
        Node left;
        Node right;

       public Node(K key, V value){

           this.key = key;
           this.value = value;
           left = null;
           right = null;
           color = RED;

       }
    }

    private Node rightRotate(Node node){
        Node x = node.left;

        /*右旋转*/
        node.left = x.right;
        x.right = node;

        x.color = node.color;
        node.color = RED;
        return x;
    }

    private void flipColor(Node node){

        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;

    }

}
