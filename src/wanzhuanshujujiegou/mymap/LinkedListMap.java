package wanzhuanshujujiegou.mymap;


import java.util.LinkedList;

public class LinkedListMap<K,V>  implements  IMyMap<K,V>{
    LinkedList<Entry> linkedList = new LinkedList();
    @Override
    public void add(K key, V value) {
            linkedList.add(new Entry<>(key,value));
    }

    @Override
    public V remove(K key) {
        for(int i = 0; i < linkedList.size(); i++ ) {
            for (Entry n : linkedList
                 ) {
                if(n.key == key ) {
                    Object o = n.value;
                    linkedList.remove(n);
                    return (V) o;
                }

            }
        }

        return null;
    }

    @Override
    public boolean contains(K key) {
        for (Entry e: linkedList
             ) {
            if(e.key == key ) {
                return true;
            }
        }

        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void set(K key, V value) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
