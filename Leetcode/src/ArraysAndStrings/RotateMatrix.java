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

                //save top
                int top = matrix[first][i];

                //left -> top
                matrix[first][i] = matrix[last-offset][last];

                //bottom -> left
                matrix[last-offset][last] = matrix[last][last - offset];

                //right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                //top -> right
                matrix[i][last] = top;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { {1,2,3},
                {4,5,6},
                {7,8,9}};

        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotate(matrix);

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
