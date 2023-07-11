//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class removeDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    public static int removeDuplicates(int[] nums) {
        int   index = 1;
        int  count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 0;
            }

            if(count <= 1){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
