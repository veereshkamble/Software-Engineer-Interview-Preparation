package HashTables;
import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            if( !isPracticallyValid(board, i, 0, i, 8)) {
                return false;
            }

            if( !isPracticallyValid(board, 0, i, 8, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPracticallyValid(char[][] board, int x1, int x2, int y1, int y2) {
        Set singleSet = new HashSet();
        for ( int i = x1; i <= x2; i++) {
            for ( int j = y1; j <= y2; j++) {
                if( board[i][j] != '.') {
                    if(!singleSet.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
