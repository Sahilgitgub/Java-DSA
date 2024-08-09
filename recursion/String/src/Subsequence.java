import java.util.Scanner;

//public class Subsequence {
////    time complexity of this code is O(n2) which is better approach than storing it in arraylist..
//    public static void sub_string(String s1, String currans) {
//        if(s1.length()==0)
//        {
//            System.out.println(currans);
//
//            return ;
//        }
//        String remString=s1.substring(1);
//
//        char curr= s1.charAt(0);
//
////        curr character chooses to be the ans
//
//        sub_string(remString,currans+curr);
//
////        curr character does not chooses to be the answer
//
//        sub_string(remString,currans);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s1= sc.next();
//        sub_string(s1," ");
//    }
//}

public class Subsequence {
    //    time complexity of this code is O(n2) which is better approach than storing it in arraylist..
    public static void sub_string(String s1, String currans) {
        if(s1.length()==0)
        {
            System.out.println(currans);
            return;
        }
        char curr=s1.charAt(0);
        String rem=s1.substring(1);
        sub_string(rem,currans+curr);
        sub_string(rem,currans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String n=sc.next();
        sub_string(n,"");
//        System.out.println("substring");
//        String remain=n.substring(0,n.length()-1);
//        System.out.println(remain);
    }
}