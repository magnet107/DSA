//https://leetcode.com/problems/n-queens/description/
import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return helper(board,0);
    }
    public static List<List<String>> helper(boolean[][] board, int row)
    {
        if(row==board.length)
        {
            List<String> temp= printing(board);
            List<List<String>> result=new ArrayList<>();
            result.add(temp);
            return result;
        }

        List<List<String>> result= new ArrayList<>();

        for (int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                List<List<String>> nextResult= helper(board,row+1);
                result.addAll(nextResult);
                board[row][col]=false;
            }
        }
        return result;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i=0;i<row;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        for (int i=1;i<=Math.min(row,col);i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }
        for (int i=1;i<=Math.min(row, board.length-col-1);i++)
        {
            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }

    public static List<String> printing(boolean[][] board)
    {
        List<String> result = new ArrayList<>();
        for (boolean[] r : board) {
            StringBuilder str=new StringBuilder();
            for (boolean item : r) {
                if (item) {
                    str.append("Q");
                } else {
                    str.append(".");
                }
            }
            result.add(String.valueOf(str));
        }
        return result;
    }
}
