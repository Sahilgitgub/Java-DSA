import java.util.*;
public class generate_binary_string {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String s = sc.next();
                binary(s, "");
            }
        }

        public static void binary(String s, String ans) {
            if (s.length() == 0) {
                System.out.print(ans + " ");
                return;
            }

            if (s.charAt(0) == '?') {
                binary(s.substring(1), ans + '0');
                binary(s.substring(1), ans + '1');
            } else {
                binary(s.substring(1), ans + s.charAt(0));
            }
        }
    }