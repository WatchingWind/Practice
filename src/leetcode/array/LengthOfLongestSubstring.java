package leetcode.array;

import java.util.ArrayList;
import java.util.LinkedList;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        if(s.trim().length() == 1){
            return 1;
        }

        int length = 0;
        char[] chars = s.toCharArray();

        ArrayList arrayList = new ArrayList();

        for(int i = 0; i < chars.length; i++ ) {
            if(arrayList.contains(chars[i])){
                if(arrayList.size() > length){
                    length = arrayList.size();
                }
                int index =  arrayList.indexOf(chars[i]);
                for(int j = 0;j <= index; j++ ){
                    arrayList.remove(0);
                }
            }
            arrayList.add(chars[i]);
        }

        length = arrayList.size() > length ? arrayList.size() : length;
        return length;
    }
}
