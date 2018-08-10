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

    private void add(String s, int count) {
        TrieNode curr = root;
        for (char c : s.toCharArray()) {
            if (curr.childrenMap.get(c) == null) {
                curr.childrenMap.put(c, new TrieNode());
            }
            curr = curr.childrenMap.get(c);;
            curr.counts.put(s, curr.counts.getOrDefault(s, 0) + count);
        }
        curr.isWord = true;
    }

}
