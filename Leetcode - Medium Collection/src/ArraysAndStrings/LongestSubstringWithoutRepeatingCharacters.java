package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int begin = 0, end = 0, counter = 0, len = 0;

        while (end < s.length()) {
            // > 0 means repeating character
            //if(map[s.charAt(end++)]-- > 0) counter++;
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) > 1) counter++;
            end++;

            while (counter > 0) {
                //if (map[s.charAt(begin++)]-- > 1) counter--;
                char charTemp = s.charAt(begin);
                if (map.get(charTemp) > 1) counter--;
                map.put(charTemp, map.get(charTemp)-1);
                begin++;
            }
            len = Math.max(len, end - begin);
        }
        return len;
    }

    public static void main(String[] args) {
        String str = "abcdeaabcdefghabcdb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
