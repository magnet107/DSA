//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class removeDup {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{6,7,8,3,3,5,5,6,2}));
    }
    public static int removeDuplicates(int[] nums) {
        int count=1;
        if(nums.length==0)
        {
            return 0;
        }
        for (int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                nums[count]=nums[i+1];
                count++;
            }
        }
        return count;
    }
    }


