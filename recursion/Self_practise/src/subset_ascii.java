public class subset_ascii {
    public static void main(String[] args) {
        String s="abc";
        subset(s,"");
    }

    public static void subset(String s,String ans) {
        if(s.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        subset(s.substring(1),ans);
        subset(s.substring(1),ans+s.charAt(0));
        subset(s.substring(1),ans+(int)s.charAt(0));
    }
}
