//https://leetcode.com/problems/palindrome-number/description/
public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2147483647));
    }
    public static boolean isPalindrome(int x) {
        int num=x;
        if(x<0)
        {
            return false;
        }
        String s=Integer.toString(x);
       int start=0;
       int end=s.length()-1;
       while (start<end)
       {
           if(s.charAt(start)!=s.charAt(end))
           {
               return false;
           }
           start++;
           end--;
       }
           return true;
    }
}
