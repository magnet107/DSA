//https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
