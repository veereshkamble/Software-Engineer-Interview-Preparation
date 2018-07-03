package ArraysAndStrings;
import java.util.*;

public class PascalTriangle {

    public List<List<Integer>> generatePascalTriangle(int numRows) {

        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int i=0; i<numRows; i++) {
            row.add(0, 1);
            for (int j=1; j<row.size()-1; j++)
                row.set(j, row.get(j) + row.get(j+1));
            allRows.add(new ArrayList<>(row));
            //allRows.add(row);
        }
    return allRows;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generatePascalTriangle(5));
    }
}
