//https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
public class jumpGameOne {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1,1,0,1}));
    }
    public static boolean canJump(int[] nums) {
        int reachUpto=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>reachUpto) return false;
            reachUpto=Math.max(reachUpto,i+nums[i]);
        }
        return true;
    }
}
