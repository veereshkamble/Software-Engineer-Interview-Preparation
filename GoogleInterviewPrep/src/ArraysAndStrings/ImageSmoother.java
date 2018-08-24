package ArraysAndStrings;

public class ImageSmoother {

    public int[][] imageSmoother(int[][] M) {
        if(M == null || M.length == 0) {
            return M;
        }
        int m = M.length;
        int n = M[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                M[i][j] = calculateAverage(M, m, n, i, j);
            }
        }
        return M;
    }

    public int calculateAverage(int[][] M, int m, int n, int i, int j) {
        int sum = 0;
        int count = 0;
        for(int x = Math.max(i-1, 0); x <= Math.min(i+1, m-1); x++) {
            for(int y = Math.max(j-1, 0); y <= Math.min(j+1, n-1); y++) {
                sum += M[i][j];
                count++;
            }
        }
        System.out.print(sum +  " " + count);
        System.out.println();
        return sum / count;
    }

    public static void main(String[] args) {
        int[][] M = new int[][] {{1,1,1},
                                 {1,0,1},
                                 {1,1,1}};

        ImageSmoother imageSmoother = new ImageSmoother();
        int[][] result = imageSmoother.imageSmoother(M);

        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
