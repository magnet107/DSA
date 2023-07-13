//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{3,3,3},3)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
               while (mid>=0 && nums[mid]==target)
               {
                   mid--;
               }
               int start=mid+1;
               mid=start;
               while (mid<nums.length && nums[mid]==target)
               {
                   mid++;
               }
               int end=mid-1;
               return new int[]{start,end};
            }
            if(nums[mid]<target)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}
