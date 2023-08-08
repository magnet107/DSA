//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
package Questions;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Stack;

public class minAddToMakeParenthesesValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (char c:
             s.toCharArray()) {
            if(c==')') {
                if(!stack.isEmpty() && stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }

            }
            else
            {
                stack.push(c);
            }

        }
        return stack.size();
    }
}
