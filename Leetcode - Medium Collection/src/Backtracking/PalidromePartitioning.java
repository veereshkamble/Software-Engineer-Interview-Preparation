package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalidromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, 0);
        return list;
    }

    
}
