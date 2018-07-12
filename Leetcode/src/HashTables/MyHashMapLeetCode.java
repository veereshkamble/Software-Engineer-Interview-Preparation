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

    public void put(int key, int value) {
        int index = getIndex(key);
        int pos = getPos(key, index);
        if (pos < 0) {
            // Add new (key, value) pair if key does not exist
            if(map[index] == null) {
                map[index] = new ArrayList<Pair<Integer, Integer>>();
            }
            map[index].add(new Pair(key, value));
        } else {
            // Update the value of key exists
            map[index].set(pos, new Pair(key, value));
        }
    }
}
