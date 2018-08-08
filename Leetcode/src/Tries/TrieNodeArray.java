package Tries;

public class TrieNodeArray {
    // change this value to adapt to different cases
    public static final int N = 26;
    public TrieNodeArray[] children = new TrieNodeArray[N];

    // you might need some extra values according to different cases
}

/** Usage:
 *  Initialization: TrieNode root = new TrieNode();
 *  Return a specific child node with char c: root.children[c - 'a']
 */
