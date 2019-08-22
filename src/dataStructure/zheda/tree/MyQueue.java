package dataStructure.zheda.tree;

import java.util.Objects;

public class MyQueue<T> {
    T[] arr;
    int capacity;
    int head = 0;
    int tail = 0;
    int size = 0;
    public MyQueue(int capacity){
        this.capacity = capacity;
        arr = (T[])new Object[capacity];
    }


    public void add (T e ) {
        arr[tail++] = e;
        size++;
        if(tail == capacity){
            tail = tail % capacity;
        }
    }
    public int size(){
        return size;
    }
    public T pop(){
        size--;
       return arr[head++];
    }
}
