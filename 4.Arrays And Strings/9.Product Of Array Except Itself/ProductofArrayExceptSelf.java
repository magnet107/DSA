//https://leetcode.com/problems/product-of-array-except-self/description/
import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int count=0;
        int product=1;
        for (int n:
                nums) {
            if(n==0)
            {
                count++;
                continue;
            }
            product*=n;

        }
        if(count>1 || count==nums.length)
        {
            product=0;
            return ans;
        }
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0 && count==0)
            {
                ans[i]=product/nums[i];
            }
            else if(nums[i]==0)
            {
                ans[i]=product;
            }
            else
            {
                ans[i]=0;
            }
        }

        return ans;
    }
}
