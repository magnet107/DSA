//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150
public class indexOfFirstOccurance {
    public static void main(String[] args) {
        System.out.println(strStr("a","a"));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0) return -1;
       for (int i=0;i<=haystack.length()-needle.length();i++)
       {
           String sub=haystack.substring(i,needle.length()+i);
           if(sub.equals(needle))
           {
               return i;
           }
       }
       return -1;
    }
}
