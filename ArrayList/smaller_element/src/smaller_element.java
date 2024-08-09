import java.net.SocketOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.*;
public class smaller_element {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        ArrayList<Integer> se = new ArrayList<>();


        System.out.println("Enter the value to compare: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) < x) {
                se.add(al.get(i));
            }
        }
        System.out.println(se);
    }
}
