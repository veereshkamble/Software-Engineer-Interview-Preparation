package HashTables;
import java.util.*;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        char[] string1 = s.toCharArray();
        char[] string2 = s.toCharArray();
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        int i = 0;
        while(i < string1.length) {
            if(!hashMap.containsKey(string1[i])) {
                hashMap.put(string1[i], string2[i]);
            }
            i++;
        }
        int j = 0;
        while(j < string1.length) {
            System.out.println(hashMap.get(string1[j]));
            if(hashMap.get(string1[j]) != string2[j]) {
                return false;
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        String string1 = "aa";
        String string2 = "ab";

        System.out.println(isomorphicStrings.isIsomorphic(string1, string2));

    }
}
