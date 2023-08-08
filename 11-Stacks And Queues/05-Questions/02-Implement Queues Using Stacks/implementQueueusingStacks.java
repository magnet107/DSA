//https://leetcode.com/problems/implement-stack-using-queues/
package Questions;

import java.util.Stack;

public class implementQueueusingStacks {
    class MyQueue {
        public Stack<Integer> s1=new Stack<>();
        public Stack<Integer> s2=new Stack<>();
        public MyQueue() {

        }
        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            int removed=s2.pop();
            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            return removed;
        }


        public int peek() {
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            int peek=s2.peek();
            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            return peek;
        }

        public boolean empty() {
            return s1.isEmpty();
        }
    }
}
