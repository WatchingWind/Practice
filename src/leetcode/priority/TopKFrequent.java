package leetcode.priority;

import java.util.*;
import java.util.function.IntToDoubleFunction;

public class TopKFrequent {
    class MyComparator implements Comparator<Freq>{

        @Override
        public int compare(Freq o1, Freq o2) {
            return 0;
        }
    }

    private class Freq implements Comparable<Freq>{
        int e, freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq o) {
            if(this.freq < o.freq){
                return -1;
            }
            if(this.freq > o.freq){
                return 1;
            }
            return 0;
        }
    }
    public  List<Integer> topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return null;
        }

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for(int i = 0;i < nums.length;i++){
            if(treeMap.containsKey(nums[i])){
                treeMap.put(nums[i],treeMap.get(nums[i])+ 1);
            }else{
                treeMap.put(nums[i],1);
            }

        }


        PriorityQueue<Freq> priorityQueue = new PriorityQueue();

        for(int key : treeMap.keySet()){
            if(priorityQueue.size() < k){
                priorityQueue.add(new Freq(key,treeMap.get(key)));
            }else {
                if(priorityQueue.peek().freq < treeMap.get(key)){
                    priorityQueue.poll();
                    priorityQueue.add(new Freq(key,treeMap.get(key)));
                }
            }
        }

        LinkedList<Integer> linkedList = new LinkedList();
        for (Freq f: priorityQueue
             ) {
            linkedList.add(f.e);
        }
        return linkedList;

    }


    public static void main(String[] args) {
        TopKFrequent top = new TopKFrequent();
        List list = top.topKFrequent(new int[]{4,1,-1,2,-1,2,3},2);

    }
}

