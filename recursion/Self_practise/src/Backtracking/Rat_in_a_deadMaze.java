package Backtracking;

public class Rat_in_a_deadMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1},
        };
        int rows=3;
        int clms=4;
//        boolean isvisited[][]=new boolean[rows][clms];
        deadMaze(0,0,rows-1,clms-1,"",maze);
    }

    public static void deadMaze(int sr,int sc,int er,int ec,String ans,int maze[][]) {
        if(sr<0 || sc<0 || sr>er || sc>ec  || maze[sr][sc]==0 || maze[sr][sc]==-1)
            return;

        if(sr==er && sc==ec)
        {
            System.out.println(ans);
            return;
        }

        maze[sr][sc]=-1;

        deadMaze(sr+1,sc,er,ec,ans+"R",maze);
        deadMaze(sr,sc+1,er,ec,ans+"D",maze);
        deadMaze(sr-1,sc,er,ec,ans+"U",maze);
        deadMaze(sr,sc-1,er,ec,ans+"L",maze);

        maze[sr][sc]=1;
    }
}





//public class Rat_in_a_deadMaze {
//    public static void main(String[] args) {
//        int[][] maze = {
//                {1, 0, 1, 1},
//                {1, 1, 1, 1},
//                {1, 1, 0, 1},
//        };
//        int rows = 3;
//        int cols = 4;
//        boolean[][] isVisited = new boolean[rows][cols];
//        deadMaze(0, 0, rows - 1, cols - 1, "", isVisited, maze);
//    }
//
//    public static void deadMaze(int sr, int sc, int er, int ec, String ans, boolean[][] isVisited, int[][] maze) {
//        // Base cases
//        if (sr < 0 || sc < 0 || sr > er || sc > ec || isVisited[sr][sc] || maze[sr][sc] == 0)
//            return;
//
//        if (sr == er && sc == ec) {
//            System.out.println(ans);
//            return;
//        }
//
//        // Mark current cell as visited
//        isVisited[sr][sc] = true;
//
//        // Explore all four directions
//        deadMaze(sr, sc + 1, er, ec, ans + "R", isVisited, maze); // Right
//        deadMaze(sr + 1, sc, er, ec, ans + "D", isVisited, maze); // Down
//        deadMaze(sr, sc - 1, er, ec, ans + "L", isVisited, maze); // Left
//        deadMaze(sr - 1, sc, er, ec, ans + "U", isVisited, maze); // Up
//
//        // Backtrack: Unmark the current cell
//        isVisited[sr][sc] = false;
//    }
//}
