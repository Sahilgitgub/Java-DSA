import java.util.*;

public class calculate_frequency {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer,Integer>freq=new HashMap<>();
//        time complexity of put and contains has O(n)..
        for(int el:arr)
        {
            if(!freq.containsKey(el))
            {
                freq.put(el,1);
            }
            else {
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxfreq=0, anskey=-1;
        for(var e:freq.entrySet())
        {
            if(e.getValue()>maxfreq)
            {
                maxfreq=e.getValue();
                anskey=e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",anskey,maxfreq);
    }
}