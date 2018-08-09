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

    public int sum(String prefix) {
        TrieNode cur = root;
        for(char c : prefix.toCharArray()) {
            TrieNode next = cur.childrenMap.get(c);
            if(next == null) {
                return 0;
            }
            cur = next;
        }
        return dfs(cur);
    }

    public int dfs(TrieNode root) {
        int sum = 0;
        for(char c : root.childrenMap.keySet()) {
            sum += dfs(root.childrenMap.get(c));
        }
        return sum + root.val;
    }

    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 5);
        System.out.println(mapSum.sum("ap"));
        mapSum.insert("app", 3);
        System.out.println(mapSum.sum("ap"));
    }
}
