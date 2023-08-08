//https://leetcode.com/problems/remove-linked-list-elements/
package Questions;

public class removeLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode removeElements(ListNode head, int val) {
            if (head == null) return head;
            ListNode prev = null;
            ListNode cur = head;
            while (cur != null) {
                if (cur.val != val) {
                    if (prev == null) {
                        prev = cur;
                        head = prev;
                    } else {
                        prev.next = cur;
                        prev = cur;
                    }
                } else {
                    if (prev != null) {
                        prev.next = null;
                    } else {
                        head = cur;
                    }
                }
                cur = cur.next;
            }
            return head;
        }
    }
}
