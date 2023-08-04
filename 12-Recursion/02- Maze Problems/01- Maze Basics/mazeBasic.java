import java.util.ArrayList;

//how many ways are there to travel from (0,0) to (2,2) in matrix
public class mazeBasic {
    public static void main(String[] args) {
        System.out.println(count(0,0));
        System.out.println(path("",0,0));
        System.out.println(pathDiagonal("",0,0));
    }
    public static int count(int r,int c)
    {
        if(r==2 || c==2)
        {
            return 1;
        }
        int left=count(r+1,c);
        int right=count(r,c+1);
        return left+right;
    }
    public static ArrayList<String> path(String p,int r,int c)
    {
        if(r==2 & c==2)
        {
            ArrayList<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> arr=new ArrayList<>();
        if(r<2) {
             arr.addAll(path(p + 'D', r + 1, c));
        }
        if(c<2) {
            arr.addAll(path(p + 'R', r, c + 1));
        }
        return arr;
    }
    public static ArrayList<String> pathDiagonal(String p,int r,int c)
    {
        if(r==2 & c==2)
        {
            ArrayList<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> arr=new ArrayList<>();
        if(r<2) {
            arr.addAll(pathDiagonal(p + 'D', r + 1, c));
        }
        if(c<2) {
            arr.addAll(pathDiagonal(p + 'R', r, c + 1));
        }
        if(r<2 && c<2)
        {
            arr.addAll(pathDiagonal(p+"Di",r+1,c+1));
        }
        return arr;
    }
}
