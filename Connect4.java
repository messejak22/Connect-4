public class Connect4 {


	public static void main(String[] args) {

		board();
		PlayerOne p1 = new PlayerOne();
		System.out.println();
		p1.gamePlay();


	}


	public static void board() {
		
		int columnsLen = 7;
		int rowsLen = 6;	
		char[][] board = new char[rowsLen][columnsLen];
		System.out.println("     A   B   C   D   E   F   G   ");
		for (int i = 0; i < rowsLen; i++) {
			System.out.print(i + 1);	
			for (int j = 0; j < columnsLen; j++) {
				System.out.print("  | " + board[i][j]);
				
			}
			System.out.print("  |\n");
		
		} 



	}


}
