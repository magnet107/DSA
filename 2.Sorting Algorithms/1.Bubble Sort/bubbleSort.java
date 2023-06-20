import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={4,2,6,8,1,9,5,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr)
    {
        boolean swapped;
        for (int i=0;i<arr.length;i++)
        {
            swapped=false;
            for (int j=1;j<arr.length;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            if(!swapped)
            {
                break;
            }

        } return arr;
    }
}
