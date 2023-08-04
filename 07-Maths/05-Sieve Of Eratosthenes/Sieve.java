public class Sieve {
    public static void main(String[] args) {
        int n=50;
        boolean[] arr=new boolean[n+1];
        seive(arr,n);
    }
    public static  void seive(boolean[] arr,int n)
    {
        for (int i=2;i<Math.sqrt(n);i++)
        {
            if(!arr[i])
            {
                for (int j=i *2;j<=n;j+=i)
                {
                    arr[j]=true;
                }
            }
        }
        System.out.println("Prime numbers are ");
        for (int i=2;i<n;i++)
        {
            if(!arr[i])
            {

                System.out.println(i);
            }
        }
    }
}
