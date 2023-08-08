package Questions.Sorting;
public class mergeSort {
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
    public ListNode sortList(ListNode head) {
            if(head==null || head.next==null)
            {
                return head;
            }
            ListNode mid=getMidNode(head);
           ListNode left=sortList(head);
           ListNode right=sortList(mid);
           return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode node = new ListNode();
        ListNode current = node;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return node.next;
    }
    public ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode midPrev = null;

        while (fast != null && fast.next != null) {
            midPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (midPrev != null) {
            midPrev.next = null;
        }

        return slow;
    }
}
