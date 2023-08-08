//https://leetcode.com/problems/delete-node-in-a-linked-list/
package Questions;

public class deleteNodeinLinkedLIst {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  //we are not deleting node technically,but replacing its value by its next node value
    //and we are connecting updated node to its next.next node
    public void deleteNode(ListNode node) {
        int dummy=node.next.val;
        node.next=node.next.next;
        node.val=dummy;
    }
}
