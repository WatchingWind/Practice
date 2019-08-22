package leetcode.greedy;

import java.util.Arrays;

public class FindContentChildren_455 {
    public int findContentChildren(int[] g, int[] s) {
        if(g == null || s == null) {
            return 0;
        }
        if(g.length == 0 || s.length == 0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);


        int index = s.length - 1;
        for(int i = g.length - 1; i >= 0; i-- ) {
            if(g[i] <= s[index]) {
                index --;
            }
            if(index == -1){
                break;
            }
        }
        return s.length - 1 - index;
    }
}
