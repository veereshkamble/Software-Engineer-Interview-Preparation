package Tries;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<String>();
        TrieNode root = buildTrie(words);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }

    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for(String s : words) {
            TrieNode cur = root;
            for(char c : s.toCharArray()) {
                if(cur.childrenMap.get(c) == null) {
                    cur.childrenMap.put(c, new TrieNode());
                }
                cur = cur.childrenMap.get(c);
            }
            cur.word = s;
        }
        return root;
    }

    public void dfs (char[][] board, int i, int j, TrieNode curNode, List<String> result) {
        char c = board[i][j];

        if( c == '#' || curNode.childrenMap.get(c) == null) {
            return;
        }

        curNode = curNode.childrenMap.get(c);
        if(curNode.word != null) {
            result.add(curNode.word);
            curNode.word = null;
        }

        board[i][j] = '#';
        if(i > 0) dfs(board, i-1, j, curNode, result);
        if(i < board.length - 1) dfs(board, i+1, j, curNode, result);
        if(j > 0) dfs(board, i, j-1, curNode, result);
        if(j < board.length - 1) dfs(board, i , j+1, curNode, result);
        board[i][j] = c;
    }
}
