//https://leetcode.com/contest/biweekly-contest-110/problems/insert-greatest-common-divisors-in-linked-list/
package Questions;

public class insertGCD {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=temp1.next;
        while (temp2!=null)
        {
            ListNode gcd=new ListNode(gcd(temp1.val,temp2.val));
            temp1.next=gcd;
            gcd.next=temp2;
            temp1=temp2;
            temp2=temp2.next;
        }
        return head;
    }
    public int gcd(int a,int b)
    {
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
