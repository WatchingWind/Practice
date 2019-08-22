package wanzhuansuanfamianshi.DynamicPrograming;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Intersection_349 {
   public static int[] intersection(int[] nums1, int[] nums2 ) {
       Set set1 = new HashSet();
       for(int i = 0; i < nums1.length; i++ ) {
           set1.add(nums1[i]);
       }
       Set<Integer> results = new HashSet();
       for(int j = 0; j < nums2.length; j++ ) {
           if(set1.contains(nums2[j]) ) {
               results.add(nums2[j]);
           }
       }

       int[] resultArr = new int[results.size()];
       int index = 0;
       for (int result: results
            ) {
           resultArr[index++] = result;
       }
       return resultArr;
   }


}
