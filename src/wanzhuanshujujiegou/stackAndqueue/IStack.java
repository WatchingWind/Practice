package wanzhuanshujujiegou.stackAndqueue;

public interface IStack<E> {
    public void push(E e);
    public E pop();
    public E peek();
    public int getSize();
    public boolean isEmpty();
}
