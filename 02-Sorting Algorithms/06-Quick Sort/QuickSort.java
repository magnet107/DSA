import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        int[] arr={4,3,9,8,1,7,3,6,8,9,2};
        Quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void Quick(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int s=low;
        int e=high;
        int m=(s+e)/2;
        int pivot=arr[m];


        while (s<=e)
        {

            //if its already sorted then it will not swap.thats why taken this
            while (arr[s]<pivot)
            {
                s++;
            }
            while (arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

            //now pivot will be in correct index.Now its time for recursion call

            Quick(arr,low,e);
            Quick(arr,s,high);



        }


    }
}
