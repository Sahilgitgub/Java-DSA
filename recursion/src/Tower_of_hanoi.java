import java.util.Scanner;
//time complexity-2 raise to n  O(2^n)
public class   Tower_of_hanoi {
    public static void toh(int n,int source,int helper,int destination)
    {
        if(n==1)
        {
            System.out.println("mov disk" +n+ "from A to C");
            return;
        }
        toh(n-1,source,destination,helper);
        System.out.println("mov disk" +n+ " from B to C");
        toh(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,1,2,3);
    }
}
