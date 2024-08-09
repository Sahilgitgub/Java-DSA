import java.util.Scanner;

public class first_occurence {
    public static int  fr_occ(int arr[],int key,int idx)
    {
        if(arr[idx]==key)
        {
            return idx;
        }
        return fr_occ(arr,key,idx+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key to find: ");
        int key=sc.nextInt();
        System.out.println( fr_occ(arr,key,0));
    }
}
