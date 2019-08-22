package wanzhuanshujujiegou.tree;

public class BinarySearchTree {
    private Node head;
    public BinarySearchTree(){

    }

    public void  insert(Node node){
        if(head == null){
            head = node;
            return;
        }
        Node cur = head;
        while(true){
            if(cur.val > node.val){
                if(cur.left != null){
                    cur = cur.left;
                } else{
                  cur.left = node;
                  break;
                }
            }else if( cur.val <= node.val){
                if(cur.right != null){
                    cur = cur.right;
                }else {
                    cur.right = node;
                    break;
                }
            }
        }
    }

    public boolean find(Node node){
        if(head == null){
            return false;
        }
        Node cur = head;
        while(true){
            if(cur.val == node.val){
                return true;
            }
            else if(cur.val < node.val){
                if(cur.right == null){
                    return false;
                }
                cur = cur.right;
            }else if(cur.val > node.val){
                if(cur.left == null){
                    return false;
                }
                cur = cur.left;
            }
        }
    }

    public Node FindMaxValue(){
        if(head == null){
            return null;
        }
        if(head.right == null){
            Node cur = head;
            if(head.left == null){
                head = null;
            }else {
                head = head.left;
            }
            return cur;
        }
        Node last = head;
        Node cur = last.right;
        Node next;
        while (true){
            next = cur.right;
            if(next == null){
                last.right = null;
                return cur;
            }
            last = cur;
            cur = next;
        }
    }
}
