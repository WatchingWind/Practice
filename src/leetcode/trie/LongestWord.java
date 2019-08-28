package leetcode.trie;



public class LongestWord {

    private class Node{
        public boolean isWord;
        Node[]  nodes = new Node[26];
        public Node next;
    }


    public String longestWord(String[] words) {
        Node n = new Node();
        for(int i = 0;i < words.length;i++ ) {
            Node cur = n;
            for(int j = 0;j < words[i].length();j++ ) {

                if(cur == null){
                    cur = new Node();
                }
                if(j == words[i].length() - 1){
                    cur.isWord = true;
                }

                if(cur.nodes[words[i].charAt(j) - 'a'] == null){
                    cur.nodes[words[i].charAt(j) - 'a']= new Node();
                }
                cur = cur.nodes[words[i].charAt(j) - 'a'].next;
            }
        }

        while()
    }

    private int
}
