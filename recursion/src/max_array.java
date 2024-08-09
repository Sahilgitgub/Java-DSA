import java.util.Scanner;

public class max_array {
    static  int max_of_array(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }

        int smallans = max_of_array(arr,idx+1);
        return Math.max(arr[idx],smallans);
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
       System.out.println(max_of_array(arr,0));

    }
}
