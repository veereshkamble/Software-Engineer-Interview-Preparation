package Tries;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public boolean isWord;
    public int val;
    public Map<Character, TrieNode> childrenMap;

    public TrieNode() {
        childrenMap = new HashMap<>();
        isWord = false;
        val = 0;
    }
}
