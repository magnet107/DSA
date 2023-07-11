

public class reverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(10000110));
    }

    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = n & 1;
            int temp = lsb << (31 - i);
            ans |= temp;
            n >>= 1;
        }
        return ans;

    }
}