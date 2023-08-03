import java.util.ArrayList;

public class returnArraylistWithoutUsingAsParameter {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,4,3,2,5,6,1,8,1};
        int target=1;
        System.out.println(without(arr,target,0));
    }
    public static ArrayList<Integer> without(int [] arr,int target,int i)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length)
        {
            return list;
        }
        if(arr[i]==target) {
            list.add(i);
        }
        ArrayList<Integer> list2=without(arr,target,i+1);
        list.addAll(list2);
        return list;
    }
}
