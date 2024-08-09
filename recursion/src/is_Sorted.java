import java.util.Scanner;

public class is_Sorted{
    public static boolean sorted(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return true;
        }
        if(arr[idx]>arr[idx+1])
        {
            return false;
        }
        return sorted(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sorted(arr,0));

    }
}



///******************************************************************************
//
// Online Java Compiler.
// Code, Compile, Run and Debug java program online.
// Write your code in this editor and press "Run" button to execute it.
//
// *******************************************************************************/
//import java.util.Scanner;
//class Main
//{
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int a[]=new int[7];
//        for(int i=0;i<7;i++)
//            a[i]=sc.nextInt();
//        int max=a[0];
//        for(int i=1;i<a.length;i++)
//        {
//            if(a[i]>max)
//                max=a[i];
//        }
//        int b[]=new int[max+1];
//        for(int i=0;i<a.length;i++)
//            b[a[i]]++;
//        for(int i=0;i<b.length-1;i++)
//        {
//            if(b[i]!=0 && b[i]>7/3)
//                System.out.println(i);
//        }
//    }
//}
//
//
