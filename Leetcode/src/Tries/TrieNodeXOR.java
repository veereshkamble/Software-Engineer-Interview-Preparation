package Tries;

import java.util.HashMap;
import java.util.Map;

public class TrieNodeXOR {

    Map<Integer, TrieNodeXOR> childrenMap;

    public TrieNodeXOR() {
        childrenMap = new HashMap<Integer, TrieNodeXOR>();
    }
}
