//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.Set;

public class maxNoOfVowels {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
    }
    public static int maxVowels(String s, int k) {
            Set<Character> set=Set.of('a','e','i','o','u');
            int curMax=0;
            for (int i=0;i<k;i++)
            {
                if(set.contains(s.charAt(i)))
                {
                    curMax++;
                }
            }
            int finalMax=curMax;
            for (int i=k;i<s.length();i++)
            {
                if(set.contains(s.charAt(i)))
                {
                    curMax++;
                }
                if(set.contains(s.charAt(i-k)))
                {
                    curMax--;
                }
                finalMax=Math.max(finalMax,curMax);
            }
            return finalMax;
            }
}
