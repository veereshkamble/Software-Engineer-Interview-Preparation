package Tries;

import java.util.ArrayList;
import java.util.List;

public class PalindromePairs {

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();

        TrieNode root = new TrieNode();
        for(int i = 0; i < words.length; i++) {
            buildTrie(root, words[i], i);
        }

        for(int i = 0; i < words.length; i++) {
            searchTrie(words, i, root, result);
        }
        return result;
    }

    
}
