public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,11,6,7,8};
        System.out.println(sortedOrNot(arr,0));
    }
    public static boolean sortedOrNot(int[] arr,int f)
    {
        if(f==arr.length-1)
        {
            return true;
        } else if (arr[f]<arr[f+1]) {
            return sortedOrNot(arr,f+1);
        }
        return false;
    }
}
