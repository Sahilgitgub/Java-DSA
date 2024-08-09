//phone book question
public class Q_17 {

    public static void main(String[] args) {
        String [] arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String digits="23";
        print(digits,arr,"");
    }
    public static void print(String digits,String arr[],String ans)

    {
        if(digits.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=digits.charAt(0);
        int k=ch-48;
        String ques=arr[k-1];
        for(int i=0;i<ques.length();i++)
        {
            print(digits.substring(1),arr,ans+ques.charAt(i));
        }
    }
}
//also try q_875 leercode;