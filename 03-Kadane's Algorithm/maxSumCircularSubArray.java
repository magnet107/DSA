//https://leetcode.com/problems/maximum-sum-circular-subarray/?envType=study-plan-v2&envId=top-interview-150
package KadanesAlgorithm;
public class maxSumCircularSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{5,-3,5}));
    }
    public static int maxSubarraySumCircular(int[] nums) {
        int curMax=nums[0];
        int finalMax=nums[0];
        int curMin=nums[0];
        int finalMin=nums[0];
        int total=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            total+=nums[i];
            curMax=Math.max(nums[i],curMax+nums[i]);
            curMin=Math.min(nums[i],curMin+nums[i]);
            finalMax=Math.max(finalMax,curMax);
            finalMin=Math.min(finalMin,curMin);
        }
        return finalMax>0?Math.max(finalMax,total-finalMin):finalMax;
    }
}
