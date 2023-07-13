//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0,j=0,k=0;
        int[] arr=new int[nums1.length+nums2.length];
        while (i<=nums1.length && j<=nums2.length) {
            if (i == nums1.length) {
                while (j < nums2.length) {
                    arr[k++] = nums2[j++];
                }
                break;
            }
            if (j == nums2.length) {
                while (i < nums1.length) {
                    arr[k++] = nums1[i++];
                }
                break;
            }
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            }
            else  {
                arr[k++] = nums2[j++];
            }
        }
        int mid=arr.length/2;
        return arr.length%2!=0?(float)arr[mid]:(float)(arr[mid-1]+arr[mid])/2;
    }
}
