//https://leetcode.com/problems/bitwise-and-of-numbers-range/?envType=study-plan-v2&envId=top-interview-150
public class bitwiseAndOfNumbersRange {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));
    }
    public static int rangeBitwiseAnd(int left, int right) {
        int shift=0;
        while (left<right)
        {
            left>>=1;
            right>>=1;
            shift++;
        }
        return left<<shift;
    }
}
