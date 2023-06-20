import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,1,3,2,8,7,99,6,87,1,8};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
       }

    private static int[] mergesort(int[] arr) {
        if(arr.length==1)
        {
            return arr;
        }

        //now dividing array by half
        int mid=arr.length/2;


        //leftPartOfArray
        int[] first=mergesort(Arrays.copyOfRange(arr,0,mid));

        //rightPartOfArray
        int[] second=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {

        //new array for merging left and right side parts of array
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i<first.length)
        {
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

}
