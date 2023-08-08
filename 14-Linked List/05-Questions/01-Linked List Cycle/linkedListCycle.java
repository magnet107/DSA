//https://leetcode.com/problems/linked-list-cycle/
package Questions;

public class linkedListCycle {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

  //slow and fast pointer approach
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }

    public int cycleLength(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            int length=0;
            if(slow==fast)
            {
                //find length
                ListNode temp=slow;
                do {
                    temp=temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }

}
