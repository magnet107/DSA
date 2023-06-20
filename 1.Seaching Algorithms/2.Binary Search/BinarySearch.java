public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,8,9,33,111,136};
        int target=11;
        System.out.println(binarySearch(arr,target));
    }

    public static int binarySearch(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while (s<e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==target)
            {
                while (arr[mid]==target)
                {
                    mid--;
                }
                return mid+1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        } return -1;
    }
}
