package ArraysAndStrings;

import java.util.Arrays;

public class PascalsTriangle {

    public int[][] PascalsTriangle(int n) {
        int[][] matrix = new int[n][n];

        for(int line=0; line<n; line++) {
            for(int i=0; i <= line; i++){
                if(line == i || i == 0)
                    matrix[line][i] = 1;
                else
                    matrix[line][i] = matrix[line-1][i-1] + matrix[line-1][i];
                System.out.print(matrix[line][i] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void  main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        pascalsTriangle.PascalsTriangle(10);
    }
}
