package HashTables;
import javafx.util.Pair;

import java.util.*;

public class MyHashMapLeetCode {
    private final int MAX_LEN = 100000;             //the amount of buckets
    private List<Pair<Integer, Integer>>[] map;     //hash map implemented by array

    /**Initializing data structure here*/
    public MyHashMapLeetCode() {
        map = (List<Pair<Integer, Integer>>[]) new ArrayList[MAX_LEN];
    }

    /**Returns the corresponding bucket index */
    private int getIndex(int key) {
        return key % MAX_LEN;
    }

    /** Search the key in a specific bucket. Return -1 if the key does not exist */
    private int getPos(int key, int index) {
        //Each bucket contains a list.
        List<Pair<Integer, Integer>> temp = map[index];
        if(temp == null) {
            return -1;
        }
        for(int i = 0; i < temp.size(); ++i) {
            if(temp.get(i).getKey() == key) {
                return i;
            }
        }
        return -1;
    }

}
