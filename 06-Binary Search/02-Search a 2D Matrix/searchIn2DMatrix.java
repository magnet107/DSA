//https://leetcode.com/problems/search-a-2d-matrix/?envType=study-plan-v2&envId=top-interview-150
public class searchIn2DMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{0,2,3},{8,9,10}},0));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[r].length-1;
        while (r< matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return true;
            }
            if(matrix[r][c]>target)
            {
                c--;
            }
            else
            {
                r++;
            }
        } return false;

    }
}
