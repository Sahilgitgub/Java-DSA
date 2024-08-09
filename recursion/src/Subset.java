import java.util.Scanner;

public class Subset {
    public static void print_subset(int arr[],int idx)
    {
        if(idx==arr.length)
        {
           return;
        }
        String result="";
        for(int i=idx;i<arr.length;i++)
        {
            result+=arr[i];
//            sum+=result;
            System.out.println(result);
        }
        print_subset(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print_subset(arr,0);

    }
}
