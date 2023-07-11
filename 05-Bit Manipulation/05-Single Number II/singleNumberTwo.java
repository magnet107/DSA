//https://leetcode.com/problems/single-number-ii/?envType=study-plan-v2&envId=top-interview-150
public class singleNumberTwo {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,2,3}));
    }
    public static int singleNumber(int[] nums) {
        int result=0;
        for (int i = 0; i < 32; i++) {
            int count=0;
            int mask=1<<i;
            for (int num:
                 nums) {
                if((num & mask)!=0)
                {
                    count++;
                }
            }
            if(count%3!=0)
            {
                result |=mask;
            }
        }
        return result;
    }
}
