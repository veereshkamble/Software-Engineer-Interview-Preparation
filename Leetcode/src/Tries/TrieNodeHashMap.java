package Tries;

import java.util.HashMap;
import java.util.Map;

public class TrieNodeHashMap {

    public Map<Character, TrieNodeHashMap> children = new HashMap<>();

    // you might need some extra values according to different cases
}

/** Usage:
 *  Initialization: TrieNode root = new TrieNode();
 *  Return a specific child node with char c: root.children.get(c)
 */
