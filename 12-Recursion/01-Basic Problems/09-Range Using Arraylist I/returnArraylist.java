import java.util.ArrayList;

public class returnArraylist {
    public static void main(String[] args) {
        int[] arr={1,4,2,3,5,6,4,3,2};
        int target=3;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(multi(arr,target,0,list));
    }
    public static ArrayList multi(int [] arr,int target,int i,ArrayList list)
    {
        if(i==arr.length)
        {
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
            return multi(arr,target,i+1,list);
        }
        return multi(arr,target,i+1,list);
    }
}
