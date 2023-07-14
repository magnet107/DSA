//https://leetcode.com/problems/powx-n/description/
public class powerOfNumber {
    public static void main(String[] args) {
        System.out.println(myPow(2,4));
    }
    public static double myPow(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double p = 1;
        while (n != 0) {
            if ((n & 1) != 0) {
                p *= x;
            }
            x *= x;
            n >>>= 1;
        }
        return p;
    }
}
