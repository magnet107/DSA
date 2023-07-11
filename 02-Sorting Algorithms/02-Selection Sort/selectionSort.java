import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr)
    {
        boolean swapped=false;
        int e=arr.length-1;
        for (int i=0;i<arr.length;i++)
        {
            int max=0;
            int maxPos=0;
            for (int j=0;j<=e;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    maxPos=j;
                }
            }
            swap(arr,maxPos,e,swapped);
            e--;
        }
        return arr;
    }
    public static void swap(int[] arr,int f,int s,boolean swapped)
    {
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
        swapped=true;
    }
}
