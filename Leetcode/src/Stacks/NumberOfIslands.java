package Stacks;

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

    public void DFSMarking(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        DFSMarking(grid, i-1, j);
        DFSMarking(grid, i+1, j);
        DFSMarking(grid, i, j-1);
        DFSMarking(grid, i, j+1);
    }

    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = new char[][] {{'1','1','0','0','0'},
                                      {'1','1','0','0','0'},
                                      {'0','0','1','0','0'},
                                      {'0','0','0','1','1'}};

        System.out.println(numberOfIslands.numOfIslands(grid));
        
    }
}
