package HashTables;

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

    

}
