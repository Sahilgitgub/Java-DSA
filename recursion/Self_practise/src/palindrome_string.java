public class palindrome_string {
        public static String reverse(String str,String ch,int i)
        {
            if(i<0)
            {
                return ch;
            }
            return reverse(str,ch+str.charAt(i),i-1);
        }
        public static void main(String[] args) {
            String str="ababa";
            String reversed=reverse(str,"",str.length()-1);
            System.out.println(reversed);
            if(str.equals(reversed))
            {
                System.out.println("palindrome String");
            }
            else{
                System.out.println("not a palindeome string");
            }
        }
}
