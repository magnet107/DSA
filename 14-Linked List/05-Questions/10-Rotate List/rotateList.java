//https://leetcode.com/problems/rotate-list/
package Questions;
public class rotateList {
    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
     }
  }
    public ListNode rotateRight(ListNode head, int k) {
       if(k<1 || head==null || head.next==null) return head;
       int length=0;
       ListNode last=head;
       while (last!=null)
       {
           last=last.next;
           length++;
       }
       last.next=head;
       int rot=k%length;
       int skip=length-rot;
       ListNode newLast=head;
        for (int i = 0; i < skip; i++) {
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;
        return head;
    }
}
