//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
public class reverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("hii how are you"));
    }
    public  static String reverseWords(String s) {
        s=s.replaceAll("\\s+"," ");
        String[] arr=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for (int i=arr.length-1;i>=0;i--)
        {
            ans.append(arr[i]+" ");
        }
        return ans.toString().trim();
    }
}
