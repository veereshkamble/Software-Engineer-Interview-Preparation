package Tries;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AutoCompleteSystem {
    TrieNode root;
    String prefix;

    public AutoCompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        prefix = "";
        for(int i = 0; i < sentences.length; i++) {
            buildTrie(sentences[i], times[i]);
        }
    }

    private void buildTrie(String s, int count) {
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

    public List<String> input(char c) {
        if (c == '#') {
            buildTrie(prefix, 1);
            prefix = "";
            return new ArrayList<String>();
        }

        prefix = prefix + c;
        TrieNode curr = root;
        for (char cc : prefix.toCharArray()) {
            if (curr.childrenMap.get(cc) == null) {
                return new ArrayList<String>();
            }
            curr = curr.childrenMap.get(cc);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (a.c == b.c ? a.s.compareTo(b.s) : b.c - a.c));
        for (String s : curr.counts.keySet()) {
            pq.add(new Pair(s, curr.counts.get(s)));
        }

        List<String> res = new ArrayList<String>();
        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
            res.add(pq.poll().s);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] sentences = new String[] {"i love you", "island", "ironman", "i love leetcode"};
        int[] times = new int[] {5, 3, 2, 2};
        AutoCompleteSystem autoCompleteSystem = new AutoCompleteSystem(sentences, times);

        List<String> result;
        result = autoCompleteSystem.input('i');
        for(String str : result) {
            System.out.print(str + "   ");
        }
        System.out.println();

        result = autoCompleteSystem.input(' ');
        for(String str : result) {
            System.out.print(str + "   ");
        }
        System.out.println();

        result = autoCompleteSystem.input('a');
        for(String str : result) {
            System.out.print(str + "   ");
        }
        System.out.println();



        result = autoCompleteSystem.input('s');
        for(String str : result) {
            System.out.print(str + "   ");
        }
        System.out.println();



    }
}
