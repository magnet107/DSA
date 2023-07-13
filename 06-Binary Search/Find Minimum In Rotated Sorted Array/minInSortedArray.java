//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class minInSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
    public static int findMin(int[] nums)
    {
        int flag=0;
       for (int i=0;i<nums.length-1;i++)
       {
           if(nums[i]>nums[i+1])
           {
               flag=1;
               break;
           }
       }
       if(flag==0) return nums[0];
       int start=0;
       int end=nums.length-1;
       while (start<=end)
       {
           int mid=start+(end-start)/2;
           if(nums[0]<=nums[mid])
           {
               start=mid+1;
           }
           else
           {
               end=mid-1;
           }
       }
       return nums[start];
    }
}
