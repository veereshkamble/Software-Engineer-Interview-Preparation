package Recursion;

import java.util.ArrayList;
import java.util.List;

public class WordSquares {

    class TrieNode {
        List<String> startWith;
        TrieNode[] children;

        TrieNode() {
            startWith = new ArrayList<>();
            children = new TrieNode[26];
        }
    }

   
}
