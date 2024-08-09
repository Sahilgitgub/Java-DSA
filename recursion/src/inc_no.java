import java.util.Scanner;

public class inc_no {
    public static void   increase(int n) {
        if(n==0)
        {
            return;
        }
        increase(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        increase(n);
    }
}
