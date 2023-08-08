package Questions;
public class startNodeOfCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
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
    public ListNode detectCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        int length=cycleLength(s);
        if(length==0) return null;
        while (length>0)
        {
            s=s.next;
            length--;
        }
        while (f!=s)
        {
            f=f.next;
            s=s.next;
        }
        return f;
    }

}
