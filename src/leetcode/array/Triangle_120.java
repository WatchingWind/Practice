package leetcode.array;

import java.util.Arrays;
import java.util.List;

public class Triangle_120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
       /* List list = triangle.get(triangle.size() - 1);
        int[] temparr = new int[triangle.size()];
       for(int i = 0;i < list.size();i++){
           temparr[i] = (int)list.get(i);
           System.out.println(temparr[i]);
       }
       for(int i = triangle.size() - 2;i >= 0;i--){
           for(int j = 0;j <= i;j++){
               temparr[j] = triangle.get(i).get(j) + Math.min(temparr[j],temparr[j + 1]);
           }
       }

       return temparr[0];*/
       //保存相加的临时值，长度为 triangle.size() - 1,初识值为最后一行的值
       int temparr[] = new int[triangle.size()];
       for(int i = 0;i < triangle.size();i++){
           temparr[i] = triangle.get(triangle.size() - 1).get(i);
       }
       for(int i = triangle.size() - 2;i >= 0;i--){
           for(int j = 0;j <= i;j++){
               temparr[j] = triangle.get(i).get(j) + Math.min(temparr[j],temparr[j +1]);
           }
       }
       return temparr[0];
    }
}
