import java.util.Scanner;
import java.util.Random;

/**
 * TicTacToe
 * UC3 reads a slot number (1-9) entered by the user. 
 * This use case focuses only on input handling without validation.
 */
public class TicTacToe {

    // Global variables from UC1 & UC2
    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        // Step 1: Initialize (UC1)
        initializeBoard();

        // Step 2: Toss (UC2)
        tossAndAssignSymbols();
        displayTossResult();

        // Step 3: Print board (UC1)
        printBoard();

        // Step 4: Get Slot Input (UC3)
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * UC3: Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1-9)
     */
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your move (1-9): ");
        int slot = sc.nextInt();
        return slot;
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
        System.out.println("Human: " + humanSymbol + " | Computer: " + computerSymbol);
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