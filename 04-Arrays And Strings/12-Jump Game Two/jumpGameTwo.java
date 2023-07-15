//https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class jumpGameTwo {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
    public static int jump(int[] nums) {
        int steps = 0, currentStop = 0, currentReach = 0, lastIndex = nums.length - 1;
        for (int i = 0; i < lastIndex; ++i) {
            currentReach = Math.max(currentReach, i + nums[i]);
            if (i == currentStop) {
                steps += 1;
                currentStop = currentReach;
                if (currentStop >= lastIndex) return steps;
            }
        }
        return steps;
    }
}
