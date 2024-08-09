import java.util.Scanner;

public class Array_recursion {
    public static void  printarray(int arr[],int idx)
    {
        if(idx==arr.length)
        {
            return;
        }
        System.out.print(arr[idx]);
        printarray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        printarray(arr,0);
    }
}
