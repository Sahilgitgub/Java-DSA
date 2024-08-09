import java.util.Scanner;

public class number_table {
    public static void num_t(int n,int k)
    {
//        base cases
//        if(k==0)
//        {
//            System.out.println(0);
//            return;
//        }
        if(k==1)
        {
            System.out.println(n);
            return;
        }
//        recursive work
            num_t(n,k-1);

//        self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
       num_t(n,k);
    }
}
