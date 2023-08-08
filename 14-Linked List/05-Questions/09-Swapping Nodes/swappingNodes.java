//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
package Questions;

import java.util.HashMap;

public class swappingNodes {
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
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode f = head;
        ListNode s = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) f = temp;
            temp = temp.next;
        }
        temp = head;
        for (int i = 1; i <= count; i++) {
            if (i == count + 1 - k) {
                s = temp;
                break;
            }
            temp = temp.next;
        }
        int a = f.val;
        f.val = s.val;
        s.val = a;
        return head;
    }
}

