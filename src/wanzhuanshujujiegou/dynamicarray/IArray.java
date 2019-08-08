package wanzhuanshujujiegou.dynamicarray;

public interface IArray<T>{
    public int addLast(T value);
    public int add(int index,T value);
    public int remove(int index);
    public int removeFirst();
    public int removeLast();
    public int set(int index,T value);
    public T get(int index);
    public int size();
    public int capacity();
    public boolean isEmpty();
    public boolean contains(T e);
    public int find(T e);
    public int removeElement(T e);
}
