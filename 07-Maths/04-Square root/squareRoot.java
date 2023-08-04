public class squareRoot {
    public static void main(String[] args) {
        int n=20;
        int p=3;
        System.out.println(sqrt(n,p));
    }
    public static  double sqrt(int n,int p)
    {
        int s=0;
        int e=n;
        int mid=n/2;
        double root=0.0;
        while ( s<=e)
        {
            mid=(s+e)/2;
            if(mid * mid ==n)
            {
                return mid;
            }
            if(mid * mid >n)
            {
                e=mid-1;
            }
            else
            {
                s = mid + 1;
            }
        }
        double incr=0.1;
        for (int i=0;i<p;i++)
        {
            while (root * root <n)
            {
                root+= incr;
            }
            root-=incr;
            incr /=10;
        }
        return root;
    }
}
