import java.util.HashMap;
import java.util.Map;
public class Anagrams {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        System.out.println(isAnagram(s1,s2));
    }
    static HashMap<Character,Integer>MakefreqMap(String s)
    {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch=s.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch,1);
            }
            else
            {
                int curfreq=mp.get(ch);
                mp.put(ch,curfreq+1);
            }
        }
        return mp;
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>mp1=MakefreqMap(s);
        HashMap<Character,Integer>mp2=MakefreqMap(t);
        return mp1.equals(mp2);
    }
}
