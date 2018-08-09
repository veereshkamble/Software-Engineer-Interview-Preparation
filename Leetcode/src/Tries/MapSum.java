package Tries;

import java.util.Map;

public class MapSum {

    TrieNode root;

    public MapSum() {
        root = new TrieNode();
    }

    public void insert(String key, int val) {
        TrieNode cur = root;
        for(char c : key.toCharArray()) {
            TrieNode next = cur.childrenMap.get(c);
            if(next == null) {
                next = new TrieNode();
                cur.childrenMap.put(c, next);
            }
            cur = next;
        }
        cur.isWord = true;
        cur.val = val;
    }

    


}
