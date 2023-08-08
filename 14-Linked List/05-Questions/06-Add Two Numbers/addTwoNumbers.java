//https://leetcode.com/problems/add-two-numbers/
package Questions;

public class addTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode dummy=new ListNode(0);
      ListNode temp=dummy;
      int carry=0;
      while (l1!=null || l2!=null || carry!=0)
      {
          int a=l1!=null?l1.val:0;
          int b=l2!=null?l2.val:0;
          int sum=a+b+carry;
          carry=sum/10;
          int digit=sum%10;

          ListNode newNode=new ListNode(digit);
          temp.next=newNode;
          temp=newNode;

          l1=l1==null?null:l1.next;
          l2=l2==null?null:l2.next;
      }
      return dummy.next;

  }
}
