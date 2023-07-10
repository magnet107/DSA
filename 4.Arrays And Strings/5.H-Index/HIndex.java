//https://leetcode.com/problems/h-index/description/
import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
    }
    public static int hIndex(int[] citations) {
      Arrays.sort(citations);
     int s=0;
     int e=citations.length;
     for (int i=e-1;i>=0;i--)
     {
         if(citations[i]>=e-i)
         {
             s=Math.max(s,e-i);
         }
         else
         {
             break;
         }
     }
     return s;
    }
}
