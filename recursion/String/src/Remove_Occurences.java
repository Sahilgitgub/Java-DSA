import java.util.Scanner;

public class Remove_Occurences {
//    time Complexity taken by this code = no. of call * time taken by one call
//    tc=n*n=O(n2)
    public static String r_o(String s1,int idx){
        if(idx==s1.length())
        {
            return "";
        }
        String smallans=r_o(s1,idx+1);
        char curr=s1.charAt(idx);
        if(curr!='a')
        {
            return curr+smallans; //this operation is not constant time in cas eof String.
        }
        else {
            return smallans;
        }
    }

    //    using substring method
//    time Complexity taken by this code = no. of call * time taken by one call
//O(n2)
    public static String r_o_2(String s1)
    {
        if(s1.length()==0)
        {
            return "";
        }
        String smallans=r_o_2(s1.substring(1)); //substring operation is not a contt time its tc i  n.
        char curr=s1.charAt(0);
        if(curr!='a') {
            return curr+smallans ;
        }
        else{
            return smallans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.nextLine();
        System.out.println(r_o(s1, 0));
        System.out.println(r_o_2(s1));
    }
}
