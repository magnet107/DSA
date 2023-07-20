//https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
import java.util.HashMap;

public class isomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("abc","xyz"));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            if(map.containsKey(a[i]))
            {
                if(map.get(a[i])!=b[i])
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(b[i]) && !map.containsKey(a[i])) return false;
                map.put(a[i],b[i]);
            }
        }
        return true;
    }
}
