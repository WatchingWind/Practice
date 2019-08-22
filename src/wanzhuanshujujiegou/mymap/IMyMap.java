package wanzhuanshujujiegou.mymap;

public interface IMyMap <K,V>{
    public void  add(K key,V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void set(K key,V value);
    int getSize();
    boolean isEmpty();
}
