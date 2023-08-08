package Questions.Sorting;

public class bubbleSort {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode bubbleSort(ListNode head)
    {
        ListNode current=head;
        ListNode start=head;
        if(head==null || head.next==null)
        {
            return head;
        }
        while (start!=null)
        {
            while (head!=null)
            {
            if(current.val>head.next.val)
            {

            }
        }
    }
}
