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
    }
}
