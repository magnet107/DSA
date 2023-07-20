//https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-interview-150
public class mostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2,3,4,5,18,17,6}));
    }
    public static int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int max=0;
        while (s<=e)
        {
            int min=height[s]<height[e]?s:e;
            max=Math.max(max,Math.abs(e-s)*height[min]);
            if(height[s]<height[e])
            {
                s++;
            }
            else {
                e--;
            }
        }
        return max;
    }
}
