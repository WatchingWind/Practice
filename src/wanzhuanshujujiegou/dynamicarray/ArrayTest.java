package wanzhuanshujujiegou.dynamicarray;

import wanzhuanshujujiegou.dynamicarray.Array;

import java.util.ArrayList;

public class ArrayTest {

    /**
     * 线性结构  Arraylist linkedList，
     * @param args
     */
    public static void main(String[] args) {
        /*ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        System.out.println(arrayList.get(1));//2
        //在java中集合元素的下表是从0开始的

        int[] scores = new int[]{100,99,66};
        for(int i = 0;i < scores.length;i++){
            System.out.println(scores[i]);
        }
        for(int socre: scores){
            System.out.println(socre);
        }

        for (int socre: scores
             ) {
            System.out.println(socre);
        }
*/

        ArrayList a;
        System.out.println("=====================array============================");

        Array array1 = new Array();
        array1.addLast(1);
        array1.addLast(2);
        Array array2 = new Array(array1);
       /* array2.addLast(3);*/
        for(int i = 0;i < array2.size();i++){
            System.out.println(array2.get(i));
        }

        System.out.println("=====================add Test========================");
        Array array3 = new Array();
        array3.addLast(1);
        array3.addLast(2);
        array3.addLast(3);
        array3.add(1,6);
        for(int i = 0;i < array3.size();i++){
            System.out.println(array3.get(i));
        }
        System.out.println(array3.toString());

        array3.add(2,5);
        System.out.println(array3.toString());

        array3.addFirst(9);
        System.out.println(array3.toString());

        System.out.println(array3.get(3));
        try{
            System.out.println(array3.get(6));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println(array3.contains(5));

        System.out.println(array3.find(10));

        System.out.println(array3.remove(2));
        System.out.println(array3.toString());

        System.out.println(array3.removeLast());
        System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());
        array3.addFirst(1);   System.out.println(array3.toString());






    }
}
