package Searching;

public class bsRecur {
    public static void main(String[] args) {
        System.out.println(bsRec(new int[]{3},1,0,0));
    }
    public static int bsRec(int[] nums,int num,int s,int e)
    {
        int mid=(s+e)/2;
        if(nums[mid]==num)
        {
            return mid;
        }
        if(s>=e)
        {
            return -1;
        }
        if(nums[mid]<num)
        {
            return bsRec(nums,num,mid+1,e);
        }
        return bsRec(nums,num,s,mid-1);
    }
}
