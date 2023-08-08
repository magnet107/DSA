package Questions;

public class removeNodes {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNodes(ListNode head) {
            ListNode reversed=reverse(head);
            int max=0;
            ListNode temp=reversed;
            ListNode ans=null;
            ListNode prev=null;
            while (temp!=null)
            {
                max=Math.max(max,temp.val);
                if(temp.val>=max)
                {
                    ans=new ListNode(temp.val);
                    ans.next=prev;
                    prev=ans;
                }
                temp=temp.next;
            }
            return ans;
    }

    public ListNode reverse(ListNode node)
    {
        ListNode prev=null;
        ListNode cur=node;
        ListNode nxt=null;
        while (cur!=null)
        {
            nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        return prev;
    }

}
