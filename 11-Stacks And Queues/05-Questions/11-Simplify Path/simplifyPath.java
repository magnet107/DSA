//https://leetcode.com/problems/simplify-path/description/?envType=study-plan-v2&envId=top-interview-150
package Questions;
import java.util.Stack;

public class simplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
    public static String simplifyPath(String path) {
        String[] str=path.split("/");
        Stack<String> stack=new Stack<>();
        for (String s:
                str) {
            if(s.equals(".") || s.isEmpty())
            {
                continue;
            }
            else if(s.equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(s);
            }
        }
        return "/"+String.join("/",stack);
     }
}
