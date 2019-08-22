package newCode.list;

import newCode.ListNode;

import java.util.List;

public class ReverseList {
    public static ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode cur; //wait reverse
        ListNode last = null ;
        ListNode next = head;
        while(next != null ) {
            cur = next;
            next = next.next;//
            cur.next = last;
            last = cur;
            /**
             * 如果将第二步移动到这里，那么当 执行cur.next = last 时是会改变 cur节点中next的值的，这是会影响所有基于cur（next）地址来查找 next的操作值
             * 如果直接保存了 cur地址中的next值，那么改动cur地址中next的值时，该保存值不会被改变
             */
            //next = next.next;  将第二部移到这里是错误的选择

        }
        return last;
    }
}
