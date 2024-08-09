package Backtracking;
//
//import java.util.Scanner;
//public class rat_chases_cheese {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        char grid[][] = new char[N][M];
//        for (int i = 0; i < N; i++) {
//            String row = sc.next();
//            for (int j = 0; j < M; j++) {
//                grid[i][j] = row.charAt(j);
//            }
//        }
//        boolean visited[][] = new boolean[N][M];
//        boolean found = findPath(grid, visited, 0, 0, N, M);
//        if (!found) {
//            System.out.println("Path does not exist!");
//        }
//    }
//
//    public static boolean findPath(char[][] grid, boolean[][] visited, int row, int col, int N, int M) {
//        // Base case: If the rat reaches the cheese position
//        if (row == N - 1 && col == M - 1) {
//            visited[row][col] = true;
//            printPath(visited, N, M);
//            return true;
//        }
//
//        // Check if the current position is within the grid and not blocked
//        if (row >= 0 && row < N && col >= 0 && col < M && grid[row][col] == 'O' && !visited[row][col]) {
//            visited[row][col] = true;
//
//            // Explore in all four directions (up, down, left, right)
//            if (findPath(grid, visited, row + 1, col, N, M) ||
//                    findPath(grid, visited, row - 1, col, N, M) ||
//                    findPath(grid, visited, row, col + 1, N, M) ||
//                    findPath(grid, visited, row, col - 1, N, M)) {
//                return true;
//            }
//
//            // If none of the directions lead to the cheese, backtrack
//            visited[row][col] = false;
//        }
//        return false;
//    }
//
//    public static void printPath(boolean[][] visited, int N, int M) {
//        // Print the path
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if (visited[i][j]) {
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}






















import java.util.*;
public class  rat_chases_cheese{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char way[][]=new char[m][n];
        for(int i=0;i<m;i++) {
            String s=sc.next();
            for(int j=0;j<n;j++) {
                way[i][j]=s.charAt(j);
            }
        }
        int ans[][]=new int[m][n];
        rat_way(way,0,0,m,n,ans);
        if(x==false){
            System.out.println("NO PATH FOUND");
        }
    }
    static boolean x=false;
    public static void rat_way(char way[][],int row,int col,int m,int n,int ans[][]) {
        if(row<0 || col<0  || row>=m || col >=n || way[row][col]=='X') {
            return;
        }
        if(row==m-1 && col==n-1) {
            ans[row][col]=1;
            x=true;
            print(ans,m,n);
            return;
        }
        way[row][col]='X';
        ans[row][col]=1;
        rat_way(way,row-1,col,m,n,ans);
        rat_way(way,row+1,col,m,n,ans);
        rat_way(way,row,col+1,m,n,ans);
        rat_way(way,row,col-1,m,n,ans);
        way[row][col]='O';
        ans[row][col]=0;
    }
    public static void print(int ans[][],int m,int n) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

}