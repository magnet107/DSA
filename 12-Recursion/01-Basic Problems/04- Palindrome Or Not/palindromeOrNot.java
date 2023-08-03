public class palindromeOrNot {
    static String n1="";
    public static void main(String[] args) {
        int n=121;
        pal(n);
        if(n==Integer.valueOf(n1))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }
    }
    public static void pal(int n)
    {

        if(n%10==n)
        {
            n1=n1+n;
            return;
        }
            n1=n1+n%10;
        pal(n/10);
    }
}
