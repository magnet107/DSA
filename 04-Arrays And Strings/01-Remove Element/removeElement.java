//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class removeElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

}
