package Backtracking;

public class chess_board {
    static int count=0;
    public static void main(String[] args) {
        int [][] board=new int[3][3];
        print(board,0,0,"");
        System.out.println(count);
    }

    public static void print(int board[][],int row,int col,String path){
        path=path+"{"+row+"-"+col+"}";
        int[] r={2,1};
        int[] c={1,2};
        if(row>board.length || col>=board[0].length)
        {
            return;
        }
        if(row==board.length-1 && col==board[0].length-1)
        {
            count++;
            System.out.println(path+" ");
            return;
        }

        //Horse
        for(int i=0;i<c.length;i++)
        {
            print(board,row+r[i],col+c[i],path+"K");
        }
//        {//print(board,row+2,col+1);
        //print(board,row+1,col+2);}second way for bishop....

        //Rook
        if(row==0 || row==board.length-1 ||col ==0 ||col==board[0].length-1)
        {
            for(int i=1;i<board.length;i++)
            {
                print(board,row+i,col,path+"R");
            }
            //for col
            for(int i=1;i<board.length;i++) {
                print(board, row, col + i,path+"R");
            }
        }
        //bishop
//            (0,0),(1,1),(2,2)
        if(row==col || row+col==board.length-1)
        {
            for(int i=1;i<board.length;i++)
            {
                print(board,row+i,col+i,path+"B");
            }
        }
    }
}