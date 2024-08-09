import java.util.Scanner;

public class Linear_search {
    public static boolean ls(int arr[],int n,int target,int idx)
    {
        if(idx>=n)
            return false;
        if(arr[idx]==target)
            return true;
          return ls(arr,n,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target=sc.nextInt();
        int t=arr.length;
       if(ls(arr,n,target,0))
       {
           System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }
    }
}
