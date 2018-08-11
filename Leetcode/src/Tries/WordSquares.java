package Tries;

import java.util.ArrayList;
import java.util.List;

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

        List<String> findByPrefix(String prefix) {
            List<String> ans = new ArrayList<>();
            TrieNode cur = root;
            for (char ch : prefix.toCharArray()) {
                if(cur.childrenMap.get(ch) == null) {
                    return ans;
                }
                cur = cur.childrenMap.get(ch);
            }
            ans.addAll(cur.startWith);
            return ans;
        }
    }

    


}
