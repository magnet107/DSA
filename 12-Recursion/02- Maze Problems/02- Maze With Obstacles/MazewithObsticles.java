//here  I have considered (1,1) as obstacle

import java.util.ArrayList;

public class MazewithObsticles {
    public static void main(String[] args) {
        System.out.println(path("",0,0));
    }
    public static ArrayList<String> path(String up,int r,int c)
    {
        if(r==2 & c==2)
        {
            ArrayList<String> arr=new ArrayList<>();
            arr.add(up);
            return arr;
        }
        ArrayList<String> arr=new ArrayList<>();
        //if you step on obstacle just return the paths so far found
        if(r==1 && c==1)
        {
            return arr;
        }
        if(r<2)
        {
            arr.addAll(path(up+'D',r+1,c));
        }
        if(c<2)
        {
            arr.addAll(path(up+'R',r,c+1));
        }
        if(r<2 & c<2)
        {
            arr.addAll(path(up+"di",r+1,c+1));
        }
        return arr;
    }



}
