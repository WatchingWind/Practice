package newCode;

import java.util.ArrayList;

public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        int[] arrayList = new int[array.length];
        int l = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++ ) {
            if(array[i] % 2 != 0 ){
                swap(array,l++,i);
            }else {
               arrayList[count++] = array[i];
            }
        }
        for (int i = 0; i < count; i++ ) {
            array[l++] = arrayList[i];
        }
       for(int i = 0; i < array.length; i++ ) {
           System.out.print(array[i]);
       }
    }
    public static void swap(int[] array,int a, int b ) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        /*array[a] = array[a] ^ array[b];
        array[b] = array[a] ^ array[b];
        array[a] = array[a] ^ array[b];*/
    }
}
