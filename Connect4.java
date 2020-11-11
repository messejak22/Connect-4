public class Connect4 {


        // global variables
        public static int playerOneChoice;
        public static int playerTwoChoice;
        public static int columnsLen = 7;
        public static int rowsLen = 6;
        public static char[][] board = { {' ', ' ', ' ', ' ', ' ', ' ', ' '},{' ', ' ', ' ', ' ', ' ', ' ', ' '},{' ', ' ', ' ', ' ', ' ', ' ', ' '},{' ', ' ', ' ', ' ', ' ', ' ', ' '},{' ', ' ', ' ', ' ', ' ', ' ', ' '},{' ', ' ', ' ', ' ', ' ', ' ', ' '}};


        public static void main(String[] args) {
            run();
        }

        public static void run() {
            // prints board
            printBoard();
            // retrieves input for player one
            PlayerOne p1 = new PlayerOne();
            System.out.println();
            playerOneChoice = p1.gamePlay();
            //place player one's piece
            placePieceOne();
            printBoard();
            // retrieves input from player two
            PlayerTwo p2 = new PlayerTwo();
            playerTwoChoice= p2.gamePlay();
            // place player two's piece
            placePieceTwo();
            printBoard();




        } // end of run method

        public static void printBoard() {
            System.out.println("     A   B   C   D   E   F   G");
            for (int i = 0; i < rowsLen; i++) {
                System.out.print(i + 1);
                for (int j = 0; j < columnsLen; j++) {
                    System.out.print("  |" + board[i][j]);

                } // end of second for loop
                System.out.print("  |\n");

            } // end of first for loop


        } // end of printBoard method

        public static void placePieceOne() {

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


        } // end of placePiece method

    public static void placePieceTwo() {

            // places piece according to choice
            if (playerTwoChoice == 1) {
                board[5][0] = 'B';
            } else if (playerTwoChoice == 2) {
                board[5][1] = 'B';
            } else if (playerTwoChoice == 3) {
                board[5][2] = 'B';
            } else if (playerTwoChoice == 4) {
                board[5][3] = 'B';
            } else if (playerTwoChoice == 5) {
                board[5][4] = 'B';
            } else if (playerTwoChoice == 6) {
                board[5][5] = 'B';
            } else if (playerTwoChoice == 7) {
                board[5][6] = 'B';
            }
    } // end of placePieceTwo method

}
