import java.util.*;
public class Example_hashmap {
    public static void main(String[] args) {
//        In HashMap searching,insertion,deletion,contains all those work done in O(1) time complexity..
//        In hashMap key value pairs are unordered.. order of values is not decided.
//        It uses HashTable for storage..
        Map<Integer,String> mp=new HashMap<>();
        mp.put(3,"Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Bhoomi");
        mp.put(4,"Sahil");
        mp.putIfAbsent(1,"Sahil");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsValue("Bhoomi"));
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        for(var i:mp.values())
        {
            System.out.println(i);
        }
        for(var i:mp.keySet())
        {
            System.out.println(i);
        }
        for(var e:mp.entrySet())
        {
            System.out.println(e);
        }
    }
}
