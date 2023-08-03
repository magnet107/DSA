public class reverseNumber {
    public static void main(String[] args) {
        reverseNumber(123567);
    }
    public static void reverseNumber(int n)
    {
        if(n%10==n)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverseNumber(n/10);

    }

}
