//package Backtracking;
//
//public class n_queens {
//    public static void main(String[] args) {
//        int n=4;
//        char board[][]=new char[n][n];
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++) {
//                board[i][j] = 'X';
//            }
//            System.out.println();
//        }
//
//        n_queen(board,0);
//    }
//
//    private static void n_queen(char[][] board, int row) {
//        int n=board.length;
//            if(row==n)
//                    {
//                    for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++) {
//                System.out.println(board[i][j]);
//            }
//            System.out.println();
//        }
//                    }
//        for(int j=0;j<n;j++)
//        {
//            if(isSafe(board,j,row)){  //row col
//            board[row][j]='Q';
//             n_queen(board,row+1);
//             board[row][j]='X';   //backtracking..
//            }
//        }
//    }
//
//    private static boolean isSafe(char[][] board, int row, int col) {
//        int n=board.length;
//        for(int j=0;j<row;j++)
//        {
//            //check row
//            if(board[row][j]=='Q')
//                return false;
//        }
//        //check col
//        for(int i=0;i<n;i++)
//        {
//            if(board[i][col]=='Q')
//                return false;
//        }
//
//        int i=row;
//        int j=col;
////        check north east
//        while(i>=0 && j<n)
//        {
//            if(board[i][j]=='Q')
//                return false;
//            i++;
//            j--;
//        }
//        i=row;
//        j=col;
//        //check south east
//        while(i>=0 && j<n)
//        {
//            if(board[i][j]=='Q')
//                return false;
//            i++;
//            j++;
//        }
//        i=row;
//        j=col;
//        //check south west
//        while(i<n && j>=0)
//        {
//            if(board[i][j]=='Q')
//                return false;
//            i--;
//            j++;
//        }
//        i=row;
//        j=col;
//        while(i<n && j>=0)
//        {
//            if(board[i][j]=='Q')
//                return false;
//            i--;
//            j--;
//        }
//    return true;
//    }
//}

package Backtracking;

public class n_queens {
    public static void main(String[] args) {
        int n = 4; // Change this to the desired board size
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueen(board, 0);
    }

    private static void nQueen(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            // If all queens are placed, print the solution
            printSolution(board);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place queen
                nQueen(board, row + 1); // Move to the next row
                board[row][col] = 'X'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // Check if there's a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    private static void printSolution(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
