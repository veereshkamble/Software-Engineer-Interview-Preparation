package HashTables;
import java.util.*;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length; i++) {
            if(hashMap.containsKey(str[i])) {
                int count = hashMap.get((str[i]));
                hashMap.put(str[i], count+1);
            } else {
                hashMap.put(str[i], 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println("(" + entry.getKey() + "," +entry.getValue() + ")");
        }

        for (int i = 0; i < str.length; i++) {
            if(hashMap.get(str[i]) == 1) {
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        String s = "lleetcode";

        System.out.println(firstUniqueCharacter.firstUniqChar(s));
    }
}
