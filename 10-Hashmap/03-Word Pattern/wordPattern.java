//https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
import java.util.HashMap;

public class wordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("aaaa","og dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap h1 = new HashMap<Character, String>();
        HashMap h2 = new HashMap<String, Character>();

        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        for (int i=0;i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (h1.containsKey(ch))
                if (!h1.get(ch).equals(words[i]))
                    return false;
            h1.put(ch, words[i]);

            if (h2.containsKey(words[i]))
                if (!h2.get(words[i]).equals(ch))
                    return false;
            h2.put(words[i], ch);
        }

        return true;
    }
}
