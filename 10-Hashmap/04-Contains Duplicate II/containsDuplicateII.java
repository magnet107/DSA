//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150
import java.util.HashMap;


public class containsDuplicateII {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,36,7,6,8,1},3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
            {
                if(Math.abs(map.get(nums[i])-i)<=k)
                {
                    return true;
                }
                else
                {
                    map.put(nums[i],i);
                }
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
