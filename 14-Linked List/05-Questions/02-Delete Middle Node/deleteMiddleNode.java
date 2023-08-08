//https://leetcode.com/problems/middle-of-the-linked-list/
package Questions;

public class deleteMiddleNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return head.next;
        ListNode mid=middleNode(head);
        ListNode temp=head;
        while (temp!=null)
        {
            if(temp.next==mid)
            {
                temp.next=temp.next.next;
            }
            temp=temp.next;

        }
        return head;

    }
}
