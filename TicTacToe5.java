/**
 * TicTacToe5
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe5 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1));
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // Check if indices are within the 0-2 range
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            // Check if the cell is currently empty
            return board[row][col] == '-';
        }
        return false;
    }
}