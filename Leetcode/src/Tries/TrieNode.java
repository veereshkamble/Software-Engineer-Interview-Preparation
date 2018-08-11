package Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrieNode {
    public boolean isWord;
    String word;
    public int val;
    public int index;
    public Map<Character, TrieNode> childrenMap;
    public Map<String, Integer> counts;
    public List<Integer> list;

    public TrieNode() {
        childrenMap = new HashMap<>();
        counts = new HashMap<>();
        isWord = false;
        val = 0;
        word = null;
        index = -1;
        list = new ArrayList<>();
    }
}
