import java.util.*;

public class Practise_Questions {
    public static void main(String[] args) {
//        Keys are always unique in hashmap
        Map<String,Integer> mp= new HashMap<>();
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
//        or
        System.out.println();
        for(var e:mp.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
