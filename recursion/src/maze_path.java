import java.util.*;
public class maze_path
 {
    static int count=0;
    public static void maze(int i,int j,String s,int er,int ec)
    {
//        int rows=arr.length;
//        int clms=arr[0].length;
        if(i>er || j>ec)
            return;
        if(i==er && j==ec)
        {
            System.out.print(s+" ");
            count++;
            return;
        }
            maze(i,j+1,s+"V",er,ec);
            maze(i+1,j,s+"H",er,ec);
//            maze(i,j+1,s+"D",er,ec);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int clms=sc.nextInt();
//        int arr[][]=new int[rows][clms];
        maze(0,0,"",rows-1,clms-1);
        System.out.println();
        System.out.println(count);
    }
}
