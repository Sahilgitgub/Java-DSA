public class backtrack_paths {
        public static void print(int arr[][],int row,int col,String ans){
            if(row==arr.length-1 && col==arr[0].length-1)
            {
                System.out.println(ans);
                return;
            }
            if(row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col]==1)
            {
                return;
            }
            if(arr[row][col]==0)
            {
                arr[row][col]=1;
                print(arr,row+1,col,ans+"H");
                print(arr,row,col+1,ans+"V");
                print(arr,row-1,col,ans+"H");
                print(arr,row,col-1,ans+"v");
                print(arr,row+1,col+1,ans+"D");
                print(arr,row-1,col-1,ans+"D");
                arr[row][col]=0;
            }
        }
        public static void main(String args[])
        {
            int row=3;
            int col=3;
            int [][]arr=new int[3][3];
            print(arr,0,0,"");
        }
    }