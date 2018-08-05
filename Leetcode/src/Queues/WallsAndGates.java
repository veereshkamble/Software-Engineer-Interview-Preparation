package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {

    public void wallsAndGates(int[][] rooms) {
        if(rooms.length == 0 || rooms[0].length == 0) {
            return;
        }
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) {
                    queue.add(new int[] {i, j});
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] top = queue.remove();
            int row = top[0];
            int col = top[1];

            if(row > 0 && rooms[row-1][col] == Integer.MAX_VALUE) {
                rooms[row-1][col] = rooms[row][col] + 1;
                queue.add(new int[] {row-1, col});
            }

            if(row < rooms.length - 1 && rooms[row+1][col] == Integer.MAX_VALUE) {
                rooms[row+1][col] = rooms[row][col] + 1;
                queue.add(new int[] {row+1, col});
            }

            if(col > 0 && rooms[row][col-1] == Integer.MAX_VALUE) {
                rooms[row][col-1] = rooms[row][col] + 1;
                queue.add(new int[] {row, col-1});
            }

            if(col < rooms.length - 1 && rooms[row][col+1] == Integer.MAX_VALUE) {
                rooms[row][col+1] = rooms[row][col] + 1;
                queue.add(new int[] {row, col+1});
            }

        }
    }

    public static void main(String[] args) {
        WallsAndGates wallsAndGates = new WallsAndGates();
        int[][] rooms = new int[][] {{Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}};
        wallsAndGates.wallsAndGates(rooms);
        
    }
}
