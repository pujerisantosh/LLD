package linkedlistleetcode;


class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;


    }
}


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
        }


        return prev;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

    }


}
