import java.util.Arrays;

//this is used if array values are  1 to n
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={5,1,3,2,4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    public static int[] cyclicSort(int[] arr)
    {
            for (int j=0;j<arr.length;)
            {
                if(arr[j]!=j+1)
                {
                    swap(arr,j,arr[j]-1);
                }
                else
                {
                    j++;
                }
            }

        return arr;
    }
    public static void swap(int[] arr,int f,int s)
    {
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
