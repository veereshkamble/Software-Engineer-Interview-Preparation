package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrobogrammaticNumberII {

    public List<String> findStrobogrammatic(int n) {
        return recursiveHelper(n, n);
    }

    private List<String> recursiveHelper(int n, int m) {
        if (n == 0) {
            return new ArrayList<>(Arrays.asList(""));
        }
        if (n == 1) {
            return new ArrayList<>(Arrays.asList("0", "1", "8"));
        }

        List<String> list = recursiveHelper(n - 2, m);
        List<String> res = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (n != m) {
                res.add("0" + s + "0");
            }
            res.add("1" + s + "1");
            res.add("6" + s + "9");
            res.add("8" + s + "8");
            res.add("9" + s + "6");
        }
        return res;
    }

    public static void main(String[] args) {
        StrobogrammaticNumberII strobogrammaticNumberII = new StrobogrammaticNumberII();
        System.out.println(strobogrammaticNumberII.findStrobogrammatic(5));
    }


}
