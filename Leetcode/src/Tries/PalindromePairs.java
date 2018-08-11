package Tries;

import java.util.ArrayList;
import java.util.Arrays;
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

    public void buildTrie(TrieNode root, String word, int index) {
        TrieNode cur = root;
        for(int i = word.length() - 1; i >=0; i++) {
            char c = word.charAt(i);
            if(cur.childrenMap.get(c) == null) {
                cur.childrenMap.put(c, new TrieNode());
            }
            if(isPlaindrome(word, 0, i)) {
                cur.list.add(index);
            }
            cur = cur.childrenMap.get(c);
        }
        cur.list.add(index);
        cur.index = index;
    }

    public boolean isPlaindrome(String word, int i, int j) {
        while(i < j) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void searchTrie(String[] words, int i, TrieNode root, List<List<Integer>> result) {
        for(int j = 0; j < words[i].length(); j++) {
            if(root.index >= 0 && root.index != i && isPlaindrome(words[i], j, words[i].length() - 1)) {
                result.add(Arrays.asList(i, root.index));
            }
            char c = words[i].charAt(j);
            root = root.childrenMap.get(words[i].charAt(j));
        }

        for(int j : root.list) {
            if( i == j) {
                continue;
            }
            result.add(Arrays.asList(i, j));
        }
    }
}
