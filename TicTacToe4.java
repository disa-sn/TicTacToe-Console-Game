import java.util.Scanner;
import java.util.Random;

/**
 * TicTacToe4
 * UC4 converts a user-entered slot number (1-9) into corresponding
 * row and column indices of a 2D array.
 */
public class TicTacToe4 {

    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        initializeBoard();
        tossAndAssignSymbols();
        displayTossResult();
        printBoard();

        // UC3 & UC4: Get input and convert it
        int slot = getUserSlot();
        
        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Slot entered: " + slot);
        System.out.println("Converted to -> Row: " + row + ", Column: " + col);
    }

    /**
     * UC4: Converts slot number into row index using zero-based indexing.
     * Formula: (slot - 1) / 3
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * UC4: Converts slot number into column index using modulo operation.
     * Formula: (slot - 1) % 3
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // --- UC3 Method ---
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your move (1-9): ");
        return sc.nextInt();
    }

    // --- UC2 Methods ---
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);
        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        System.out.println("--- TOSS RESULT ---");
        System.out.println((isHumanTurn ? "Human" : "Computer") + " starts first.");
        System.out.println("-------------------\n");
    }

    // --- UC1 Methods ---
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}