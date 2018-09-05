package HashTables;

import java.util.*;

public class MyHashMap {
    private int buckets = 1000;
    private int itemsPerBucket = 1001;
    private int[][] table;

    /* Initialize your data Structure here */
    public MyHashMap() {

        table = new int[buckets][];
    }
    public int hash(int key) {

        return key % buckets;
    }

    public int pos(int key) {

        return key / buckets;
    }

    /*value will always be positive */
    public void put(int key, int value) {
        int hashKey = hash(key);

        if(table[hashKey] == null) {
            table[hashKey] = new int[itemsPerBucket];
            Arrays.fill(table[hashKey], -1);
        }
        table[hashKey][pos(key)] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hashKey = hash(key);
        int pos = pos(key);

        if(table[hashKey] == null) {
            return -1;
        }
        return table[hashKey][pos];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashKey = hash(key);

        if(table[hashKey] != null) {
            table[hashKey][pos(key)] = -1;
        }
    }
}
