package leetcode.greedy;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        if(t == null || s == null){
            return false;
        }
        if(s.length() == 0){
            return true;
        }

        int sl = s.length();
        int tl = t.length();

        int si = 0;
        int ti = 0 ;
        while(ti < tl && si < sl) {
            if(s.charAt(si) == t.charAt(ti)){
                ti++;
                si++;
            }else{
                ti++;
            }

        }
        return si == sl  ? true : false;
    }
}
