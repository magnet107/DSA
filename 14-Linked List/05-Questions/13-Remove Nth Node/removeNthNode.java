//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package Questions;

public class removeNthNode {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }
          public ListNode removeNthFromEnd(ListNode head, int n) {
                int length=0;
                ListNode temp=head;
                while (temp!=null)
                {
                    length++;
                    temp=temp.next;
                }
                ListNode prev=null;
                ListNode cur=head;
                int remove=length-n;
                int count=0;
                while (cur!=null)
                {
                    if(remove==0) return head.next;
                    if(count==remove)
                    {
                        if(prev==null)
                        {
                            prev=cur.next;
                        }
                        else
                        {
                            prev.next=cur.next;
                        }
                    }
                    else
                    {
                        prev=cur;
                    }
                    cur=cur.next;
                    count++;
                }
                return prev;
          }

      }

}

