//https://leetcode.com/problems/valid-parentheses/
package Questions;

import java.util.HashMap;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
    public static boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(!stack.empty() && stack.peek()==map.get(s.charAt(i)))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty()?true:false;
    }
}
