//https://leetcode.com/problems/reverse-linked-list/
package Questions;

public class reverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head)
    {
        ListNode prev=null;
        ListNode current=head;
        ListNode nxt=null;
        while(current!=null)
        {
            nxt=current.next;
            current.next=prev;
            prev=current;
            current=nxt;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head,int left,int right)
    {
        if (head == null || left == right) {
            return head;
        }

        ListNode start = head;
        ListNode p1 = null;
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        ListNode p2 = null;


        for (int i = 1; i < left; i++) {
            p1 = current;
            current = current.next;
        }

        for (int i = 0; i < right - left + 1; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (p1 != null) {
            p1.next = prev;
        } else {
            start = prev;
        }

        if (current != null) {
            p2 = current;
        }
        if (p2 != null) {
            ListNode tail = prev;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = p2;
        }

        return start;
    }

}
