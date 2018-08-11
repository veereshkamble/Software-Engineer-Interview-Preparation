package Tries;

public class WordSquares {

    class TrieSquares {
        TrieNode root;

        TrieSquares(String[] words) {
            root = new TrieNode();
            for(String word : words) {
                TrieNode cur = root;
                for(char ch : word.toCharArray()) {
                    if(cur.childrenMap.get(ch) == null) {
                        cur.childrenMap.put(ch, new TrieNode());
                    }
                    cur.childrenMap.get(ch).startWith.add(word);
                    cur = cur.childrenMap.get(ch);
                }
            }
        }

        
    }


}
