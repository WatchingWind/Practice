package newCode;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode front = head;
        ListNode back = head;
        int distance = 0;
        while(front != null ) {
            distance++;
            if(distance < k ){
                front = front.next;
            }else{
                front = front.next;
                back = back.next;
            }

        }
        if(distance < k - 1){
            return null;
        }else{
            return back;
        }


    }
}
