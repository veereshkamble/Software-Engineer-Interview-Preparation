package Tries;

class WordDictionary {

    TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()) {
            if(cur.childrenMap.get(c) == null) {
                cur.childrenMap.put(c, new TrieNode());
            }
            cur = cur.childrenMap.get(c);
        }
        cur.isWord = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        TrieNode cur = root;
        return match(word, 0, cur);
    }

    public boolean match(String word, int start, TrieNode cur) {
        if(start == word.length()) {
            if(cur.isWord == true) {
                return true;
            } else {
                return false;
            }

            char c = word.charAt(start);

            if(c != '.') {
                if(cur.childrenMap.get(c) == null) {
                    return false;
                } else {
                    return match(word, start+1, cur.childrenMap.get(c));
                }
            } else {
                
            }
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */