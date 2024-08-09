public class permutation {
    public static void permutationn(String s,String ans) {
        if(s.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            permutationn(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s="cab";
        permutationn(s,"");
    }
}
