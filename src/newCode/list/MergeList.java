package newCode.list;

import newCode.ListNode;

public class MergeList {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;

        ListNode merge = new ListNode(0);//dumb Node
        ListNode head = merge;
        if(p1 == null && p2 == null ) {
            return null;
        }

        while(p1 != null && p2 != null ) {
            if(p1.val <= p2.val){
                merge.next = p1;
                p1 = p1.next;
                merge = merge.next;
            }else {
                merge.next = p2;
                p2 = p2.next;
                merge = merge.next;
            }
        }

        if(p1 != null){
            merge.next = p1;
        }


        if(p2 != null ) {
            merge.next = p2;
        }

        return  head.next;
    }
}
