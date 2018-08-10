package Tries;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public boolean isWord;
    String word;
    public int val;
    public Map<Character, TrieNode> childrenMap;
    public Map<String, Integer> counts;

    public TrieNode() {
        childrenMap = new HashMap<>();
        counts = new HashMap<>();
        isWord = false;
        val = 0;
        word = "";
    }
}
