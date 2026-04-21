import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    // UC1 Variables
    static char[][] board = new char[3][3];

    // UC2 State Variables
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        // UC1 Logic
        initializeBoard();
        
        // UC2 Logic
        tossAndAssignSymbols();
        displayTossResult();
        
        // Final UC1 Print
        printBoard();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        // Generates either 0 or 1
        int toss = random.nextInt(2);

        if (toss == 0) {
            // Human starts
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            // Computer starts
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        System.out.println("--- TOSS RESULT ---");
        if (isHumanTurn) {
            System.out.println("Human won the toss and starts first!");
        } else {
            System.out.println("Computer won the toss and starts first!");
        }
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("-------------------\n");
    }

    // --- UC1 Methods (Keep these as they were) ---

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
            System.out.println();
            System.out.println("-------------");
        }
    }
}