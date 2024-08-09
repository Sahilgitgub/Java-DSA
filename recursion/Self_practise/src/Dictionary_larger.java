import java.util.*;
public class Dictionary_larger {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<String> list=new ArrayList<>();
        larger_order(s,list,"");
        // System.out.println(list);
        Collections.sort(list);
        for(String i:list)
        {
            if(s.compareTo(i)<0)
            {
                System.out.println(i);
            }
        }
    }
    public static void larger_order(String s,ArrayList<String>list,String ans)
    {
        if(s.length()==0)
        {
            list.add(ans);
            // System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
            larger_order(s.substring(0,i)+s.substring(i+1),list,ans+s.charAt(i));
    }
}

