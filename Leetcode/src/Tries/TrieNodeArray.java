package Tries;

public class TrieNodeArray {
    public char val;
    public boolean isWord;
    public TrieNodeArray[] children = new TrieNodeArray[26];
    public TrieNodeArray() {}
    TrieNodeArray(char c){
        TrieNodeArray node = new TrieNodeArray();
        node.val = c;
    }
}