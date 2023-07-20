//https://leetcode.com/problems/group-anagrams/submissions/?envType=study-plan-v2&envId=top-interview-150
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class groupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        if(strs.length==0) return ans;
        HashMap<String,List<String>> mp=new HashMap<>();
        for (String s:strs) {
            int[] hash=new int[26];
            for (char c:
                    s.toCharArray()) {

                hash[c-'a']++;
            }
            String key=new String(Arrays.toString(hash));
            mp.computeIfAbsent(key,k -> new ArrayList<>());
            mp.get(key).add(s);

        }
        ans.addAll(mp.values());
        return ans;
    }
}
