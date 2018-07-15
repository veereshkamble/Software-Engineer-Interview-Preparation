package HashTables;
import java.util.*;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        char[] string1 = s.toCharArray();
        char[] string2 = s.toCharArray();
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        int i = 0;
        while(i < string1.length) {
            hashMap.put(string1[i], string2[i]);
            i++;
        }
        while(i < string1.length) {
            if(hashMap.get(string1[i]) != string2[i]) {
                return false;
            }
        }
        return true;
    }
}
