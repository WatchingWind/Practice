package wanzhuanshujujiegou.tree;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class MaxHeap<E extends Comparable<E>> {
    private ArrayList<E> data ;

    public MaxHeap(int capacity){
        data = new ArrayList<E>(capacity);
    }

    public int size(){
        return data.size();
    }

    public boolean isEmpty(){
        return  data.isEmpty();
    }

    //返回一个索引对应的父节点的索引
    private int parent(int index){
        if(index == 0 ){
            throw new RuntimeException("index 0 doesn't have parent .");
        }
        return (index - 1) / 2;
    }

    //返回一个索引对应的左孩子的索引
    private int leftChild(int index){
        return index  * 2  + 1;
    }

    private  int rightChild(int index){
        return index * 2 + 2;
    }

    public void add(E e){
        data.add(e);
        siftUp(data.size() - 1);
    }

    public E findMax(){
        if(data.size() == 0){
            throw  new RuntimeException("can not find max when heap is empty");
        }
        return data.get(0);
    }

    public E Extract(){
        E max = findMax();
        data.set(0,data.get(size() - 1));
        siftDown(0);
        return max;
    }

    private void siftDown(int index) {
        while(rightChild(index) < size()){
            int j = rightChild(index);
            if(j + 1 < size() && data.get(j + 1).compareTo(data.get(j)) > 0){
                 j++;
            }
            if(data.get(index).compareTo(data.get(j)) >= 0){
                break;
            }else {
                swap(index,j);
            }
           /* E left = data.get(leftChild(index));
            E right = data.get(rightChild(index));
            if(left == null || right == null){
                break;;
            }
            E max = left.compareTo(right) > 0 ? data.get(leftChild(index)) : data.get(rightChild(index));
            if(E)*/
           index = j;
        }
    }

    private void siftUp(int i) {
        while(i > 0 && data.get(parent(i)).compareTo(data.get(i)) < 0){
            swap(i,parent(i));
            i = parent(i);
        }

    }

    private void swap(int i,int j){
        if(i < 0 || i >= size() || j < 0 || j >=size()){
            throw  new RuntimeException("Index is illegle");
        }
        E temp = data.get(i);
        data.set(i,data.get(j));
        data.set(j,temp);
    }

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        Math.random();
    }
}
