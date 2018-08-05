package Queues;

public class NumberOfIslands {
    public int numOfIslands(char[][] grid) {
        int count = 0;
        if(grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}
