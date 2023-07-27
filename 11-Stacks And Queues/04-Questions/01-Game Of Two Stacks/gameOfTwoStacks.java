package Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem

public class gameOfTwoStacks {
    public static void main(String[] args) {
        int maxSum=10;
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(1);
        b.add(2);
        b.add(1);
        b.add(8);
        b.add(5);
        System.out.println(twoStacks(10,a,b));
    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return helper(maxSum,a,b,0,0)-1;

    }
    public static int helper(int maxSum, List<Integer> a,List<Integer> b,int sum,int count)
    {
        if(sum>maxSum)
        {
            return count;
        }
        if(a.size()==0 || b.size()==0) {
            return count;
        }
        int left=helper(maxSum,a.subList(1,a.size()),b,sum+a.get(0),count+1);
        int right=helper(maxSum,a,b.subList(1,b.size()),sum+b.get(0),count+1);
        return Math.max(left,right);
    }
}
