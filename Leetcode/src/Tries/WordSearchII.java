package Tries;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<String>();
        TrieNode root = buildTrie(words);
        
    }
}
