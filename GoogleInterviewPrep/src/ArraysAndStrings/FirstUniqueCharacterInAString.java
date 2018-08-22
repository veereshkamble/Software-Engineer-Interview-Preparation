package ArraysAndStrings;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

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

        for (int i = 0; i < str.length; i++) {
            if(hashMap.get(str[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
