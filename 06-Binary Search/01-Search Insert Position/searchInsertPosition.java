//https://leetcode.com/problems/search-insert-position/?envType=study-plan-v2&envId=top-interview-150
public class searchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{4,5,6,7,8},7));
    }
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int mid=0;
        while (s<=e)
        {
            mid=(s+e)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            if(target>nums[mid])
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }  return s;
    }
}
