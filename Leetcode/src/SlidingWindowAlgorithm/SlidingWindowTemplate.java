package SlidingWindowAlgorithm;
import java.util.*;

public class SlidingWindowTemplate {

    public List<Integer> slidingWindowTemplate(String s, String t) {
        //Initialize a collection or an int value to save the result according to the question
        List<Integer> result = new LinkedList<>();

        if(t.length() > s.length()) {
            return result;
        }

        //create a hashmap tp save the characters of the target substring. also called a character frequency hashmap
        // (K, V) = (Character, Frequency of characters
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(char c : t.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        //maintain a counter to check whether we match the target string
        int counter = hashMap.size(); // this must be the map size and not the string size because the characters may be duplicate.

        //Maintain two pointers: begin - left pointer of the window; end - right pointer of the window
        int begin = 0, end = 0;

        //maintain a len variable for the length of the substing which matches the target string
        int len = Integer.MAX_VALUE;

        //loop at the beginning of the source string
        while(end < s.length()) {

            char c = s.charAt(end);

            if(hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) - 1); // plus or minus one
                if(hashMap.get(c) == 0) {
                    counter--;
                }
            }
            end++;

            //increase the begin pointer to make it valid/invalid again
            while(counter == 0) { // counter condition: different question may have different condition

                char tempc = s.charAt(begin); //be careful here: choose the character at the begin pointer, not the end pointer

                if(hashMap.containsKey(tempc)) {
                    hashMap.put(tempc, hashMap.get(tempc) - 1); // plus or minus one
                    if(hashMap.get(tempc) > 0) {
                        counter++; // modify the counter according to the requirement (different condition)
                    }
                }

                /*save / update(min/max) the result if findn a target
                result collections or result int value
                 */
                begin++;
            }
        }
        return result;
    }
}
