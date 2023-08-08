package Questions;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
import java.util.HashMap;
public class removeDuplicatesTwo {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public  ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode cur=head;
        while (cur!=null)
        {
            if(map.containsKey(cur.val))
            {
                map.put(cur.val,map.get(cur.val)+1);
            }
            else
            {
                map.put(cur.val,1);
            }
            cur=cur.next;
        }
        cur=null;
        ListNode temp=head;
        ListNode ans=null;
        while (temp!=null)
        {
            if(map.get(temp.val)==1)
            {
                if(cur==null)
                {
                    cur=temp;
                    ans=cur;
                }
                else
                {
                    cur.next=temp;
                    cur=cur.next;

                }
            }
            temp=temp.next;
        }
        if(cur!=null)
        {
            cur.next=null;
        }
        return ans;
    }

}
