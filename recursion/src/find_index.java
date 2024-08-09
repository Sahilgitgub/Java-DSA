import java.util.Scanner;
public class find_index {
    public static void fd_idx(int arr[], int val,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==val){
            System.out.println(idx);
        }
        fd_idx(arr,idx+1, val);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to find: ");
        int key=sc.nextInt();
//        int count=0;
        fd_idx(arr,key,0);
    }
}
