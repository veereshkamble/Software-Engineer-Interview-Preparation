package SlidingWindowAlgorithm;
import java.util.*;

public class LongestSubstringIII {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        Map<Character,Integer> map = new HashMap<>();
        int start = 0, end = 0, counter = 0, len = 0;
        while(end < s.length()){


            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) == 1) {
                counter++;//new char
            }
            end++;


            while(counter > k){
                char cTemp = s.charAt(start);
                map.put(cTemp, map.get(cTemp) - 1);
                if(map.get(cTemp) == 0){
                    counter--;
                }
                start++;
            }
            len = Math.max(len, end-start);
        }
        return len;

    }

    public static void main(String[] args) {
        LongestSubstringIII longestSubstringIII = new LongestSubstringIII();
        System.out.println(longestSubstringIII.lengthOfLongestSubstringKDistinct("aaaaabedbbbbbcccccdaaaaaaaaaaabbbbbbbbbbccccccd", 3));
    }
}
