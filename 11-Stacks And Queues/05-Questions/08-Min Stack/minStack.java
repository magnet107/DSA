//https://leetcode.com/problems/min-stack/description/?envType=study-plan-v2&envId=top-interview-150
package Questions;
import java.util.Stack;

public class minStack {

    class MinStack {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> min=new Stack<>();
        public MinStack() {

        }

        public void push(int val) {
            if(min.isEmpty() || val<=min.peek())
            {
                min.push(val);
            }
            stack.push(val);
        }

        public void pop() {
            if(min.peek().equals(stack.peek()))
            {
                min.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {

            return min.peek();

        }
    }
}
