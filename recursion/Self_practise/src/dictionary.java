import java.util.ArrayList;

public class dictionary {
    public static void main(String[] args) {
        String st = "cab";
        ArrayList<String> list = new ArrayList<>();
        find(st, "", list);
//        System.out.println(list);
        for(String i : list){
            if(st.compareTo(i) > 0){
                System.out.println(i);
            }
        }
    }
    public static void find(String st, String ans, ArrayList<String>list){
        if(st.length() == 0){
            list.add(ans);
//            System.out.println(ans);
            return;
        }
        for(int i=0; i<st.length(); i++){
            find(st.substring(0,i) + st.substring(i+1), ans+st.charAt(0), list);
        }
    }
}