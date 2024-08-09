import java.util.ArrayList;
import java.util.Collections;

public class permutation {
    public static void main(String[] args) {
        String s="cab";
        ArrayList<String>list=new ArrayList<>();
        print(s,"",list,s);
//        System.out.println(list);
       Collections.sort(list);
//        System.out.println(list);
       for(int i=0;i<list.size();i++)
       {
            System.out.println(list.get(i));
       }
    }
    public static void print(String s,String ans,ArrayList<String>list,String Checker) {

        if(s.length()==0)
        {
            int q=ans.compareTo(Checker);
            if(q<0)
            list.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
                        print(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i),list,Checker);
        }

        }
    }