//https://leetcode.com/problems/implement-stack-using-queues/description/
package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueues {
    class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int topElement;

        public MyStack() {

        }
        public void push(int x) {
            q1.add(x);
            topElement = x;
        }

        public int pop() {
            while (q1.size() > 1) {
                topElement = q1.remove();
                q2.add(topElement);
            }
            int popped = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return popped;
        }

        public int top() {
            return topElement;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

}
