//https://leetcode.com/problems/happy-number/
package Questions;

import java.util.HashSet;

public class HappyNumber {

    //first method using hashset
    public boolean isHappy(int n) {
        HashSet<Integer> sett=new HashSet<>();
        int sum=0;
        while (n!=1 && !sett.contains(n)) {
            sett.add(n);
            while (n != 0) {
                int last = n % 10;
                sum += last * last;
                n /= 10;
            }
            n=sum;
            sum=0;
        }
        return n==1;
    }

    //second method using linked list cyclic method
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do {
            slow=square(slow);
            fast=square(square(fast));
        }
        while (slow!=fast);
        return slow==1;

    }
    public int square(int n)
    {
        int sum=0;
        while (n!=0)
        {
            int last=n%10;
            sum+=Math.pow(last,2);
            n/=10;
        }
        return sum;
    }
}
