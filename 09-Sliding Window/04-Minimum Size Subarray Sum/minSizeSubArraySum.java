//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
public class minSizeSubArraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1,1,1,1,1}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int start=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while (i<nums.length)
        {
            sum+=nums[i];
            if(sum>=target)
            {
                while (sum>=target)
                {
                    sum-=nums[start];
                    min=Math.min(min,i-start+1);
                    start++;
                }
            }
            i++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
