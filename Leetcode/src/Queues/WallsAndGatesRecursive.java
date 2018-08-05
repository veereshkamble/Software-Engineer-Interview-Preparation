package Queues;

public class WallsAndGatesRecursive {

    public void wallsAndGates(int[][] rooms) {
        for (int i = 0; i < rooms.length; i++)
            for (int j = 0; j < rooms[0].length; j++)
                if (rooms[i][j] == 0) dfs(rooms, i, j, 0);
    }

    private void dfs(int[][] rooms, int i, int j, int d) {
        if (i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < d) return;
        rooms[i][j] = d;
        dfs(rooms, i - 1, j, d + 1);
        dfs(rooms, i + 1, j, d + 1);
        dfs(rooms, i, j - 1, d + 1);
        dfs(rooms, i, j + 1, d + 1);
    }

    public static void main(String[] args) {
        WallsAndGatesRecursive wallsAndGatesRecursive = new WallsAndGatesRecursive();
        int[][] rooms = new int[][] {{Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}};
        wallsAndGatesRecursive.wallsAndGates(rooms);

        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                System.out.print(rooms[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
