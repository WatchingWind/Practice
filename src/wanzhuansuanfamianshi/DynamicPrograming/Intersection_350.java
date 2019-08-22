package wanzhuansuanfamianshi.DynamicPrograming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Intersection_350 {
    //original
    public int[] intersect(int[] nums1, int[] nums2) {
        Map map1 = new HashMap();
        for(int i = 0; i < nums1.length; i++ ) {
           int value = map1.get(nums1[i]) == null ? 0 : (int)map1.get(nums1[i]);
           map1.put(nums1[i], ++value);
        }

        ArrayList<Integer> results = new ArrayList();
        for(int i = 0; i < nums2.length; i++ ) {
            if(map1.containsKey(nums2[i])  &&   (int)map1.get(nums2[i]) > 0 ){
                map1.put(nums2[i], (int)map1.get(nums2[i]) - 1 );
                results.add(nums2[i]);
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
