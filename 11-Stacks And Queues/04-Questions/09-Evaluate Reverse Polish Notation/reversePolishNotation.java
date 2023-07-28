//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/?envType=study-plan-v2&envId=top-interview-150
package Questions;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class reversePolishNotation {
    
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Set<String> set=new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        Stack<Integer> s=new Stack<>();
        for (int i=0;i<tokens.length;i++)
        {
            if(!set.contains(tokens[i]))
            {
                s.push(Integer.valueOf(tokens[i]));
            }
            else
            {
                int y=s.pop();
                int x=s.pop();
                if(tokens[i].equals("+"))
                {
                    s.push(x+y);
                } else if (tokens[i].equals("-")) {
                    s.push(x-y);
                }
                else if(tokens[i].equals("*"))
                {
                    s.push(x*y);
                }
                else{
                   s.push(x/y);
                }
            }
        }
        return s.peek();
    }


}
