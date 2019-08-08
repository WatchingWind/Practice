package wanzhuanshujujiegou.dynamicarray;

public class Array<T> implements IArray<T> {
    private  T[] data;
    private int size;
   //private int capacity;
    private static final int DEFAULT_CAPACITY = 8;

    /**
     * 使用默认容量，构造一个数组
     */
    public Array(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * 传入指定数组容量，构造一个数组
     * @param capacity
     */
    public Array(int capacity){
           data = (T[]) new Object[capacity];
           size = 0;
    }

    /**
     * 传入特定数组，构造一个数组
     * @param array
     */
    public Array(Array<T> array){
        data = (T[])new Object[array.size()];
        for(int i = 0;i < array.size;i++){
            data[i] = array.get(i);
        }
        size  = array.size();
    }

    /**
     * 插入元素，并返回元素的数组下标
     * @param index
     * @param value
     * @return
     */
    @Override
    public int add(int index, T value) {
        encureCapacity(size + 1);

        System.out.println(data.length);
        if(size == data.length){
            throw new RuntimeException("数据已满！");
        }
        if(index < 0 || index > size){
            throw new RuntimeException("add faided.require index >=0 and index <= size");
        }
        /*if(index < 0 && size < data.length){*/


            //temp  2
            //array 4 5 6
            int temp = size;
            while(temp > index){
                data[temp] = data[--temp];
            }
            data[index] = value;
            size++;
            return index;
       /* }
        return -1;*/
    }

    /**
     * 尾部添加元素并返回该元素的数组下标
     * @param value
     * @return
     */
    @Override
    public int addLast(T value) {

       /* if(size < data.length){
            data[size++] = value;
            return size - 1;
        }*/
       //直接复用 add方法
       return  add(size,value);
    }

    /**
     * 向首部添加一个元素
     * @param value
     */
    public void addFirst(T value){
        add(0,value);
    }

    /**
     * 根据指定下标删除元素
     * @param index
     * @return
     */
    @Override
    public int remove(int index) {
        rangeCheck(index);

        for(int i = index;i < size - 1;i++){
            data[i] = data[i + 1];
        }

        data[ --size] = null;

        return index;
    }

    @Override
    public int removeFirst() {
       return remove(0);
    }

    @Override
    public int removeLast() {
        return  remove(size - 1);
    }

    /**
     * 根据指定下标更新元素
     * @param index
     * @param value
     * @return
     */
    @Override
    public int set(int index, T value) {
        return 0;
    }

    /**
     * 根据指定下标，获取元素
     * @param index
     * @return
     */
    @Override
    public T get(int index) {
        rangeCheck(index);
        if(index < size){
            return data[index];
        }
       return null;
    }

    /**
     * 返回数组数据量大小
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 返回数组容量大小
     * @return
     */
    @Override
    public int capacity() {
        return data.length;
    }

    /**
     * 数组数据为空，则返回真
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 若包含指定元素，则返回true，否则返回false
     * @param e
     * @return
     */
    @Override
    public boolean contains(T e) {
        for(int i = 0;i < size;i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    /**
     * 查询指定元素的索引并返回，当不存在时返回 -1
     * @param e
     * @return
     */
    @Override
    public int find(T e) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    /**
     *删除指定元素并返回元素下标，若不存在该元素，则返回 -1
     * @param e
     * @return
     */
    @Override
    public int removeElement(T e) {
        int index = find(e);
        if(index != -1){
            return remove(index);
        }

        return -1;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        res.append("[");
        for(int i = 0;i < size - 1;i++){
           res.append(""+ data[i] + ",");
        }
        res.append("" + data[size-1] + "]");
        return res.toString();
    }

    private void rangeCheck(int index){
        if(index >= size || index < 0){
            throw new RuntimeException(" Required index >= 0 and index < size");
        }
    }

  private void encureCapacity(int minCapacity){
        if(minCapacity == data.length){
            int oldCapacity = data.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            T[] newData = (T[])new Object[newCapacity];
            for(int i = 0; i < data.length; i++){
                newData[i] = data[i];
            }
            data = newData;
            System.out.println("new Data:" + data.length);
            System.out.println("new Data:"+newData.length);
        }
  }

}
