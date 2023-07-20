//https://leetcode.com/problems/maximum-erasure-value/description/
import java.util.HashSet;
import java.util.Set;

public class maximumErasureValue {
    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        int f=0;
        int s=1;
        int curSum=nums[0];
        int finalSum=nums[0];
        Set<Integer> set=new HashSet<>();
        set.add(nums[0]);
        while (s<nums.length)
        {
            while (f<s && set.contains(nums[s]))
            {
                curSum-=nums[f];
                set.remove(nums[f]);
                f++;
            }
            curSum+=nums[s];
            finalSum=Math.max(finalSum,curSum);
            set.add(nums[s]);
            s++;
        }
        return finalSum;
    }

}
