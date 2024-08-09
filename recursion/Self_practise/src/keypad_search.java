//import java.util.*;
//public class keypad_search {
//    public static void main(String[] args) {
//        String keypad[]={" ","+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        String searchin[]={"kartik","sneha","deepak","arnav","shikha","palak","utkarsh","divyam","vidhi","sparsh","akku"};
//        String s="23";
//        ArrayList<String> list=new ArrayList<>();
//        nokia(s,keypad,"",list);
// 		System.out.println(list);
//        names(list,searchin);
//    }
//    public static void nokia(String s,String keypad[],String ans,ArrayList<String> list)
//    {
//        if(s.length()==0)
//        {
//            list.add(ans);
//            return;
//        }
//
//        char ch=s.charAt(0);
//        int  k=ch-'0';
//        String a=keypad[k];
//        for(int i=0;i<a.length();i++)
//        {
//            nokia(s.substring(1),keypad,ans+a.charAt(i),list);
//        }
//    }
//    public static void names(ArrayList<String> list,String searchin[])
//    {
//        for(String names:searchin)
//        {
//            for(String values:list)
//            {
//                if(names.contains(values))
//                {
//                    System.out.println(names);
//                }
//            }
//        }
//    }
//}


import java.util.*;
public class keypad_search {
    public static void main(String[] args) {
        String[] keypad = {"",".+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] searchin = {"kartik","sneha","deepak","arnav","shiksha","palak","utkarsh","divyam","vidhi","sparsh","akku"};
        String num = "34";
        ArrayList<String> list = new ArrayList<>();
        find(keypad, num, "", list);
        System.out.println(list);
        names(list, searchin);
    }
    public static void find(String[] keypad, String num, String ans, ArrayList<String> list){
        if(num.length() == 0){
            list.add(ans);
            return;
        }
        char ch = num.charAt(0);
        int n = ch-'0';
        String padSt = keypad[n];

        for(int i=0; i<padSt.length(); i++){
            find(keypad, num.substring(1), ans+padSt.charAt(i), list);
        }
    }
    public static void names(ArrayList<String> list, String[] search){
        for(String names:search){
            for(String values:list){
                if(names.contains(values)){
                    System.out.println(names);
                }
            }
        }
    }
}