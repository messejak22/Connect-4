public class Connect4 {

    // global variables
    public static int playerOneChoice;
    public static int columnsLen = 7;
    public static int rowsLen = 6;
    public static char[][] board = new char[rowsLen][columnsLen];
    public static void main(String[] args) {

        // prints board
        printBoard();

        // retrieves input for player one
        PlayerOne p1 = new PlayerOne();
        System.out.println();
        playerOneChoice = p1.gamePlay();
        placePiece();
    }

    public static void printBoard() {
        System.out.println("     A   B   C   D   E   F   G   ");
        for (int i = 0; i < rowsLen; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < columnsLen; j++) {
                System.out.print("  | " + board[i][j]);

            }
            System.out.print("  |\n");

        }


    }

    public static void placePiece() {

        // places piece according to choice
        if (playerOneChoice == 1) {
            board[5][0] = 'R';
        } else if (playerOneChoice == 2) {
            board[5][1] = 'R';
        } else if (playerOneChoice == 3) {
            board[5][2] = 'R';
        } else if (playerOneChoice == 4) {
            board[5][3] = 'R';
        } else if (playerOneChoice == 5) {
            board[5][4] = 'R';
        } else if (playerOneChoice == 6) {
            board[5][5] = 'R';
        } else if (playerOneChoice == 7) {
            board[5][6] = 'R';
        }
        printBoard();

    }




}