package Tries;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWords {

    public String replaceWords(List<String> dict, String sentence) {
        String[] tokens = sentence.split(" ");
        TrieNode trieNode = buildTrie(dict);
        return replaceWords(tokens, trieNode);
    }

    public TrieNode buildTrie(List<String> dict) {
        TrieNode root = new TrieNode();

        for(String rootWord : dict) {
            TrieNode cur = root;
            for(int i = 0 ; i < rootWord.length(); i++) {
                char c = rootWord.charAt(i);
                if(cur.childrenMap.get(c) == null) {
                    cur.childrenMap.put(c, new TrieNode());
                }
                cur = cur.childrenMap.get(c);
            }
            cur.isWord = true;
        }
        return root;
    }

    public String replaceWords(String[] tokens, TrieNode root) {
        StringBuilder sb = new StringBuilder();
        for(String token : tokens) {
            sb.append(getShortestReplacement(token, root));
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public String getShortestReplacement(String token, TrieNode root) {
        TrieNode cur = root;
        StringBuilder sb = new StringBuilder();
        for(char c : token.toCharArray()) {
            sb.append(c);
            if(cur.childrenMap.get(c) != null) {
                if(cur.childrenMap.get(c).isWord == true) {
                    return sb.toString();
                }
                cur = cur.childrenMap.get(c);
            } else {
                return token;
            }
        }
        return token;
    }

    public static void main(String[] args) {
        ReplaceWords replaceWords = new ReplaceWords();
        List<String> dict = new ArrayList<String>();
        dict.add("cat");
        dict.add("rat");
        dict.add("bat");
        dict.add("bad");
        dict.add("ra");
        String sentence = "the cattle was rattled by the battery and badminton";

        System.out.println(replaceWords.replaceWords(dict, sentence));
    }
}
