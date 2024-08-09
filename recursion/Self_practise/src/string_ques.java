import java.util.ArrayList;
import java.util.Scanner;
public class string_ques {
    public static void print(String str, String ans,ArrayList<String> list) {
        if (str.length() == 0) {

            // System.out.println('a' + '1');
            list.add(ans);
            return;
        }
        print(str.substring(1), ans + (char)( (int)str.charAt(0) +48),list);

        if (str.length() >= 2)
        {
            int two = Integer.parseInt(str.substring(0, 2));
//             System.out.println("integer at two:" + two);
            if (two<= 26)
            {
                char t = (char) ('a' + two - 1);
                print(str.substring(2), ans + t,list);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String digit = sc.next();
        ArrayList<String> list=new ArrayList<>();
        print(digit,"",list);
        System.out.println(list);
    }
}
