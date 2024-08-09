import java.net.SocketOption;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        average(arr);
    }
    public static void average(int arr[]) {
        int count=0;
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0) {
                count += arr[i];
                al.add(arr[i]);
            }
        }
        System.out.println(count/al.size());
    }
}