package leetcode.tree;

import java.util.TreeSet;

public class UniqueMorseRepresentations {
    public static int uniqueMorseRepresentations(String[] words) {
        if(words == null || words.length == 0){
            return 0;
        }
        if(words.length == 1){
            return 1;
        }
        String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> treeSet = new TreeSet<>();
        String word;
        for(int i = 0;i < words.length;i++){
           word = words[i];
           String morse = "";
           for(int j = 0;j < word.length();j++ ){
               morse += morses[word.charAt(j) - 'a'];
           }
           treeSet.add(morse);
        }
        return treeSet.size();
    }

    public static void main(String[] args) {
        int number =  UniqueMorseRepresentations.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(number);
    }
}
