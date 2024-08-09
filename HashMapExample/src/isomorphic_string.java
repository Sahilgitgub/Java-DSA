import java.util.HashMap;

public class isomorphic_string {
    public static void main(String[] args) {
        String str1="aab";
        String str2="xxy";
        System.out.println(isIsomorphic(str1,str2));
    }
    public static boolean isIsomorphic(String s,String t)
    {
        HashMap<Character,Character>mp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character Sch=s.charAt(i);
            Character tch=t.charAt(i);
            if(mp.containsKey(Sch)){
                if(mp.get(Sch!=tch))
                {
                    return false;
                }
            }
            else if (mp.containsValue(tch)) {
                return false;
            }
            else {
                mp.put(Sch,tch);
            }
        }
        return true;
    }
}
