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


}
