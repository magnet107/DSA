//https://leetcode.com/problems/find-peak-element/?envType=study-plan-v2&envId=top-interview-150
public class findPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
    public static int findPeakElement(int[] nums) {
        int s=0;
        int e= nums.length-1;
        int mid=0;
        while (s!=e)
        {
            mid=(s+e)/2;
            if(nums[mid]<nums[mid+1])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        } return s;
    }
}
