import java.util.HashMap;

public class Anagram_2nd_approach {
    public static void main(String[] args)
        {
            String str1="listen";
            String str2="silent";
            System.out.println(isAnagrams(str1,str2));
        }
        public static boolean isAnagrams(String s,String t) {
            if (s.length() != t.length()) {
                return false;
            }
            HashMap<Character, Integer> mp = makeFreq(s);
            for (int i = 0; i < t.length(); i++) {
                Character ch = t.charAt(i);
                if (!mp.containsKey(ch)) {
                    mp.put(ch, 1);
                } else {
                    int currFreq = mp.get(ch);
                    mp.put(ch, currFreq - 1);
                }
            }
            for(var i:mp.values())
            {
                if(i!=0)
                {
                    return false;
                }
            }
                return true;
        }

    static HashMap<Character,Integer>makeFreq(String s)
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
}