import java.util.Scanner;

public class arr_sum_of_element {
    public static int  sum_of_element(int arr[],int idx)
    {
//        base case
        if(idx==arr.length-1)
        {
            return arr[idx]; //or return 0
        }
//        recursive work
        int i=0;
        int small_ans=sum_of_element(arr,idx+1);
        return small_ans+arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(sum_of_element(arr,0));
    }
}
