package ArraysAndStrings;

public class RotateMatrix {

    public boolean rotate(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;

        for(int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for(int i = first; i < last; i++) {
                int offset = i - first;
                
            }
        }

    }

    public static void main(String[] args) {

    }
}
