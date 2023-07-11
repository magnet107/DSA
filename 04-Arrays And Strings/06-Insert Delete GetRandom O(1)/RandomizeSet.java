//https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150
import java.util.ArrayList;
import java.util.HashSet;

public class RandomizeSet {
    HashSet<Integer> a;
    public RandomizeSet() {
        a=new HashSet<>();
    }

    public boolean insert(int val) {
        if(a.contains(val))
        {
            return false;
        }
        else
        {
            a.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if(!a.contains(val))
        {
            return false;
        }
        a.remove(val);
        return true;
    }

    public int getRandom() {
        ArrayList<Integer> b=new ArrayList<>(a);
        int ran= (int) (Math.random()*a.size());
        return b.get(ran);
    }
}
