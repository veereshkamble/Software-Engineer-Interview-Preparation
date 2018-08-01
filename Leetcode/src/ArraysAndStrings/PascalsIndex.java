package ArraysAndStrings;

import java.util.*;

public class PascalsIndex {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascalsIndex = new LinkedList<Integer>();
        pascalsIndex.add(1);
        if(rowIndex == 0) {
           return pascalsIndex;
        }
        int multiplier = rowIndex, divider = 1;
        long current = 1;

        for(int i = 1; i < rowIndex + 1; i++) {
            current = current * multiplier;
            current = current / divider;
            pascalsIndex.add((int)current);
            multiplier--;
            divider++;
        }
        return pascalsIndex;
    }

    public static void main(String[] args) {
        PascalsIndex pascalsIndex = new PascalsIndex();
        System.out.println(pascalsIndex.getRow(8));
    }
}
