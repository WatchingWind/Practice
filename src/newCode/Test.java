package newCode;

import newCode.list.ReverseList;

public class Test {
    public static void main(String[] args) {
        ReOrderArray.reOrderArray(new int[]{1,2,3,4,5,6,7,8});
        System.out.println(0 % 2 );

        System.out.println("=========================================kthNode====================================================");


        System.out.println("============================================ReverseList============================================");
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        System.out.println("====");
        ListNode reverseNode = ReverseList.ReverseList(listNode);
        System.out.println(reverseNode.val);

        while(reverseNode != null ) {
            System.out.print(reverseNode.val + " ");
            reverseNode = reverseNode.next;
        }
    }


}
