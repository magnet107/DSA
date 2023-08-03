public class CountZeros {
    public static void main(String[] args) {
        int n=1000045008;
        int count=0;
        System.out.println(countZeros(n,count));
    }
    public static int countZeros(int n,int count)
    {
        if(n%10==n)
        {
            return count;
        }
        if(n%10==0)
        {
            count++;
        }
        return countZeros(n/10,count);

    }
}
