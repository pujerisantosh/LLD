package LinkedListDsaInterview;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;



    }
}
public class linkedListhasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast !=null && fast.next != null) {

            slow = slow.next;
            fast = fast.next;

            if (slow == fast) {

                return true;

            }

        }

        return false;

    }


    public static void main(String[] args) {

        linkedListhasCycle obj = new linkedListhasCycle();
        ListNode head1 = new ListNode(3);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(0);
        ListNode head4 = new ListNode(4);


        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head1;

        System.out.println(obj.hasCycle(head1));


    }
}
