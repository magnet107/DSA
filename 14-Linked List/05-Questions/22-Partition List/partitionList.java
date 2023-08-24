//https://leetcode.com/problems/partition-list/
package Questions;

public class partitionList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode lessDummy=new ListNode(0);
        ListNode greaterDummy=new ListNode(0);

        ListNode lessPointer=lessDummy;
        ListNode greaterPointer=greaterDummy;
        ListNode temp=head;
        while (temp!=null)
        {
            if(temp.val<x)
            {
                lessPointer.next=temp;
                lessPointer=temp;
            }
            else
            {
                greaterPointer.next=temp;
                greaterPointer=temp;
            }
            temp=temp.next;
        }
        greaterPointer.next=null;
        lessPointer.next=greaterDummy.next;

        return lessDummy.next;
    }
}
