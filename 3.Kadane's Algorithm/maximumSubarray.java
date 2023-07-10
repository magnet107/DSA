//https://leetcode.com/problems/maximum-subarray/description/?envType=study-plan-v2&envId=top-interview-150
package KadanesAlgorithm;
public class maximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1,2,3,4,5}));
    }
    public static int maxSubArray(int[] nums) {
        int curMax=nums[0];
        int finalMax=nums[0];
        for (int i = 1; i <nums.length; i++) {
            curMax=Math.max(nums[i],curMax+nums[i]);
            finalMax=Math.max(curMax,finalMax);
        }
        return finalMax;
    }
}
