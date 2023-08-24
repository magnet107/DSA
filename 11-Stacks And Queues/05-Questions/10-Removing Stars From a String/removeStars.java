//https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75
package Questions;

import java.util.Stack;

public class removeStars {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
    public static String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder str=new StringBuilder();

        for(char c:s.toCharArray()){
            if(c=='*')
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}
