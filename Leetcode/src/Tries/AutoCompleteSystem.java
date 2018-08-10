package Tries;

public class AutoCompleteSystem {
    TrieNode root;
    String prefix;

    public AutoCompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        prefix = " ";
        for(int i = 0; i < sentences.length; i++) {
            buildTrie(sentences[i], times[i]);
        }
    }

    

}
