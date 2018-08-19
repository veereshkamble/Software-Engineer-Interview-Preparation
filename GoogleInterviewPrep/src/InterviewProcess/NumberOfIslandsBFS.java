package InterviewProcess;
import java.util.*;

public class NumberOfIslandsBFS {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    grid[r][c] = '0'; // mark as visited
                    //Queue<Integer> neighbors = new LinkedList<>();
                    Queue<int[]> neighbors = new LinkedList<>();
                    neighbors.add(new int[] {r,c});
                    while (!neighbors.isEmpty()) {
                        int[] id = neighbors.remove();
                        int row = id[0];
                        int col = id[1];
                        if (row - 1 >= 0 && grid[row-1][col] == '1') {
                            neighbors.add(new int[] {row-1, col});
                            grid[row-1][col] = '0';
                        }
                        if (row + 1 < nr && grid[row+1][col] == '1') {
                            neighbors.add(new int[] {row+1, col});
                            grid[row+1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col-1] == '1') {
                            neighbors.add(new int[] {row, col-1});
                            grid[row][col-1] = '0';
                        }
                        if (col + 1 < nc && grid[row][col+1] == '1') {
                            grid[row][col+1] = '0';
                            neighbors.add(new int[] {row, col+1});
                        }
                    }
                }
            }
        }

        return num_islands;
    }

    public static void main(String[] args) {
        NumberOfIslandsBFS numberOfIslandsBFS = new NumberOfIslandsBFS();
        char[][] grid = new char[][] {{'1','1','0','0','0'},
                                      {'1','1','0','0','0'},
                                      {'0','0','1','0','0'},
                                      {'0','0','0','1','1'}};

        System.out.println(numberOfIslandsBFS.numIslands(grid));
    }
}
