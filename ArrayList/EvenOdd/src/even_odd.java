import java.util.*;
public class even_odd
    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            // int add;
            ArrayList<Integer> al=new ArrayList<>(n);
            ArrayList<Integer> odd=new ArrayList<>();
            ArrayList<Integer> even=new ArrayList<>();
//            System.out.print(al.size());
            for(int i=0;i<n;i++)
            {

                al.add(sc.nextInt());
            }
            for(int i=0;i<al.size();i++)
            {
                if(al.get(i)%2==0)
                {
                    even.add(al.get(i));
                }
                else
                {
                    odd.add(al.get(i));
                }
            }
            System.out.println(even);
            System.out.println(odd);
        }
    }

// method-2
// import java.util.*;
// public class Main
// {
    // public static void main(String[] args) {
    // Scanner sc= new Scanner(System.in);
    // int n= sc.nextInt();
    // int arr[]= new int[n];
    // for(int i=0;i<n;i++)
    // arr[i]=sc.nextInt();
    // evenodd(arr);
    // }

    // public static void evenodd(int arr[]){
    // ArrayList<Integer> odd = new ArrayList<Integer>();
    // ArrayList<Integer> even = new ArrayList<Integer>();

    // for(int i=0;i<arr.length;i++){
    // if(arr[i]%2==0)
    // even.add(arr[i]);
    // else
    // odd.add(arr[i]);
    // }

    // System.out.print(odd);
    // System.out.println();
    // System.out.print(even);
    // }
// }
