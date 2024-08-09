package Backtracking;

import java.sql.SQLOutput;

public class Four_Direction_mazePath {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
//        int arr[][]=new int[rows][clms];
        boolean isVisited[][]=new boolean[rows][cols];
        int arr[][]=new int[rows][cols];
        maze(0,0,rows-1,cols-1,"",isVisited,arr);
    }

    public static void maze(int sr, int sc, int er, int ec, String ans, boolean[][] isVisited,int arr[][]) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || isVisited[sr][sc])
            return;

        if (sr == er && sc == ec) {
//            System.out.println(ans);
            printarr(arr,0,0);
            return;
        }

        isVisited[sr][sc] = true;
        arr[sr][sc]=1;

        maze(sr, sc + 1, er, ec, ans + "D", isVisited,arr);
        maze(sr + 1, sc, er, ec, ans + "R", isVisited,arr);
        maze(sr, sc - 1, er, ec, ans + "L", isVisited,arr);
        maze(sr - 1, sc, er, ec, ans + "U", isVisited,arr);

        isVisited[sr][sc] = false;
        arr[sr][sc]=0;
    }
    public static void printarr(int arr[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}











//
//
//
//public class Main {
//    public static void main(String[] args) {
//        int rows = 3;
//        int cols = 3;
//        // Define the maze
//        // int[][] maze = {
//        //         {1, 0, 1},
//        //         {1, 1, 1},
//        //         {0, 1, 1}
//        // };
//        // Initialize visited array
//        boolean[][] visited = new boolean[rows][cols];
//        // Call maze function to find paths
//        maze(0, 0, rows - 1, cols - 1, "", visited);
//    }
//
//    public static void maze(int sr, int sc, int er, int ec, String ans, boolean[][] visited) {
//        // Base case: If the current cell is out of bounds or already visited, return
//        if (sr < 0 || sc < 0 || sr > er || sc > ec || visited[sr][sc] )
//            return;
//
//        // If reached the destination, print the path
//        if (sr == er && sc == ec) {
//            System.out.println(ans);
//            return;
//        }
//
//        // Mark the current cell as visited
//        visited[sr][sc] = true;
//
//        // Explore all four directions
//        maze(sr + 1, sc, er, ec, ans + "R", visited); // Move Right
//        maze(sr, sc + 1, er, ec, ans + "D", visited); // Move Down
//        maze(sr - 1, sc, er, ec, ans + "U", visited); // Move Up
//        maze(sr, sc - 1, er, ec, ans + "L", visited); // Move Left
//
//        // Backtrack: Unmark the current cell
//        visited[sr][sc] = false;
//    }
//}
