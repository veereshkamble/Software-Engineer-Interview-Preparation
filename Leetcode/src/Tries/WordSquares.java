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

    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ans = new ArrayList<>();
        if(words == null || words.length == 0) {
            return ans;
        }
        int len = words[0].length();
        TrieSquares trieSquares = new TrieSquares(words);
        List<String> ansBuilder = new ArrayList<>();
        for(String word : words) {
            ansBuilder.add(word);
            search(len, trieSquares, ans, ansBuilder);
            ansBuilder.remove(ansBuilder.size() - 1);
        }
        return ans;
    }

    public void search(int len, TrieSquares trieSquares, List<List<String>> ans, List<String> ansBuilder) {
        if(ansBuilder.size() == len) {
            ans.add(new ArrayList<>(ansBuilder));
            return;
        }

        int idx = ansBuilder.size();
        StringBuilder prefixBuilder = new StringBuilder();
        for(String s : ansBuilder) {
            prefixBuilder.append(s.charAt(idx));
        }
        List<String> startWith = trieSquares.findByPrefix(prefixBuilder.toString());
        for(String sw : startWith) {
            ansBuilder.add(sw);
            search(len, trieSquares, ans, ansBuilder);
            ansBuilder.remove(ansBuilder.size()-1);
        }
    }

    public static  void main(String[] args) {
        WordSquares wordSquares = new WordSquares();
        String[] words = new String[] {"area", "lead", "wall", "lady", "ball" };
        List<List<String>> result = wordSquares.wordSquares(words);

        for(List<String> list : result) {
            for(String word : list) {
                System.out.println(word + "  ");
            }
            System.out.println();
        }
    }
}
