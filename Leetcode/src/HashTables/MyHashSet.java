package HashTables;

public class MyHashSet {

    private int buckets = 1000;
    private int itemsPerBucket = 1001;
    private boolean[][] table;

    /* Initialize your data structure here*/
    public MyHashSet() {

        table = new boolean[buckets][];
    }

    public int hash(int key) {

        return key % buckets;
    }

    public int pos(int key) {

        return key / buckets;
    }

    public void add(int key) {
        int hashKey = hash(key);

        if(table[hashKey] == null) {
            table[hashKey] = new boolean[itemsPerBucket];
        }
        table[hashKey][pos(key)] = true;

    }

    public void remove(int key) {
        int hashKey = hash(key);

        if(table[hashKey] !=  null) {
            table[hashKey][pos(key)] = false;
        }
    }

    public boolean contains (int key) {
        int hashKey = hash(key);
        return table[hashKey] != null && table[hashKey][pos(key)];
    }
}
