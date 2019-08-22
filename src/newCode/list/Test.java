package newCode.list;

import newCode.ListNode;
import xuexisuanfasixiang.sort.MergeSort;

public class Test {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(4);

        ListNode mergetNode = MergeList.Merge(listNode1,listNode);
       while(mergetNode != null ) {
           System.out.print(mergetNode.val + " ");
           mergetNode = mergetNode.next;
       }
    }
}
