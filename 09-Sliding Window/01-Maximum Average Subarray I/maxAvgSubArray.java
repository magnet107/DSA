//https://leetcode.com/problems/maximum-average-subarray-i/description/
public class maxAvgSubArray {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{0,1,1,3,3},4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        double avg=sum;
        for (int i = 1; i <=nums.length-k ; i++) {
            avg=Math.max(avg,sum);
            sum=sum-nums[i-1]+nums[i+k-1];
        }
        avg=Math.max(avg,sum);
        return avg/k;
    }
}
