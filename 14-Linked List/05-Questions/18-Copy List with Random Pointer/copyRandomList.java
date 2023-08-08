//https://leetcode.com/problems/copy-list-with-random-pointer/description/?envType=study-plan-v2&envId=top-interview-150
package Questions;
import java.util.HashMap;

public class copyRandomList {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node cur=head;
        while (cur!=null)
        {
            Node temp=new Node(cur.val);
            map.put(cur,temp);
            cur=cur.next;
        }
        cur=head;
        while (cur!=null)
        {
            Node temp=map.get(cur);
            temp.next=map.get(cur.next);
            temp.random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }
}
