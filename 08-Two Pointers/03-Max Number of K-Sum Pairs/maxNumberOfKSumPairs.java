//https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;

public class maxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int s=0;
        int e=nums.length-1;
        while (s<e)
        {
            if(nums[s]+nums[e]==k)
            {
                s++;
                e--;
                count++;
            } else if (nums[s]+nums[e]<k) {
                s++;
            }
            else {
                e--;
            }
        }
        return count;
    }
}
