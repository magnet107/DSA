//https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
import java.util.Arrays;
public class rotateArray {
    public static void main(String[] args) {
      rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    public static void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums,int s,int e)
    {
        while(s<e)
        {
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }


}
