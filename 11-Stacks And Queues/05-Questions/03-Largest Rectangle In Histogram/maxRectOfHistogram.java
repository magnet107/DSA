//https://leetcode.com/problems/largest-rectangle-in-histogram/
package Questions;

import java.util.Stack;

public class maxRectOfHistogram {
    public static void main(String[] args) {

    }
    public int largestRectangleArea(int[] heights) {
        int max=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for (int i=1;i<heights.length;i++)
        {
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()])
            {
                max=maxValue(heights,stack,i,max);
            }
            stack.push(i);
        }
        int i=heights.length;
        while (!stack.isEmpty())
        {
            max=maxValue(heights,stack,i,max);
        }

        return max;
    }
    private int maxValue(int[] arr,Stack<Integer> stack,int i,int max)
    {
        int area;
        int popped=stack.pop();
        if (stack.isEmpty())
        {
            area=arr[popped] * i;
        }
        else
        {
            area=arr[popped] * (i-1-stack.peek());
        }
        return Math.max(max,area);
    }
}
