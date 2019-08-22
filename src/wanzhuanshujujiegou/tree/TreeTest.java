package wanzhuanshujujiegou.tree;

import dataStructure.zheda.tree.InOrderTraversal;

public class TreeTest {
    class Test{
        public void testThis(){
            System.out.println(this.getClass().getName());
        }
    }
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(new Node(1));
        binarySearchTree.insert(new Node(2));
        binarySearchTree.insert(new Node(5));
        System.out.println(binarySearchTree.find(new Node(5)));
       // System.out.println(binarySearchTree.FindMaxValue().val);
        Integer i1 = new Integer(230);
        Integer i2 = i1;
        i1 = null;
        System.out.println(i2);

        String s = "ssq";

      /*  int i = 0;
        if(!test() && i++ == 1){
            System.out.println(i);
        }*/


        TreeTest t = new TreeTest();
        Test test = t.new Test();
        test.testThis();

    }

    public static boolean test (){
        throw new RuntimeException();
    }

}
