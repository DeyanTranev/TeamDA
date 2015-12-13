
public class ChessBoard {
	int totalRows;
	int totalCols;
	int row;
	int col;
	char[][] board;

	void moveKnight(int row, int col) {
		
		
		if (row<0 || row> board.length-1) {
			return;
		}
		if (col<0 || col > board[0].length-1) {
			return;
		}
		if (board[row][col] == 'k') {
			return;
		}
		board[row][col]='k';
		moveKnight(row-2,col-1);
		moveKnight(row-2,col+1);
		moveKnight(row-1,col-2);
		moveKnight(row-1,col+2);
		moveKnight(row+1,col-2);
		moveKnight(row+1,col+2);
		moveKnight(row+2,col-1);
		moveKnight(row+2,col+1);
	}
	void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != 'k') {
					board[i][j]='0';
				}
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print("|"+board[i][j]+"|");
			}
			System.out.println();
		}
	}

}
