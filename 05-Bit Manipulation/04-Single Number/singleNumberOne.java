//https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=top-interview-150
public class singleNumberOne {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1,1,3}));
    }
    public static int singleNumber(int[] nums) {
        int ans=0;
        for (int n :nums)
        {
            ans ^=n;
        }
        return ans;
    }
}
