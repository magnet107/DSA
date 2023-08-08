//https://leetcode.com/problems/merge-two-sorted-lists/
package Questions;
public class mergeTwoSortedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }

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

            // Connect the remaining nodes, if any
            if (head1 != null) {
                current.next = head1;
            } else {
                current.next = head2;
            }

            return node.next;
        }
    }


}
