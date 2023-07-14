//https://leetcode.com/problems/factorial-trailing-zeroes/description/
public class factorialTrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }
    public static int trailingZeroes(int n) {
        int count=0;
        for(int i=5;i<=n;i*=5)
        {
            count+=n/i;
        }
        return count;
    }
}
