package TicTacToeGame;

public class TicTacToe {
	char[][] tBoard;
	int row;
	int col;
	char playerSymbol='0';
	String player = "Player1";
	
	
	void playerMark(int row, int col) {
		boolean valid = ((row>=0 && row<=2 && col>=0 && col<=2) && (this.tBoard[row][col]=='\u0000'));
		if (!valid) {
			System.out.println("Entry invalid - out of board or occupied cell, please make a valid entry");
		}
		
		if (valid) {
			tBoard[row][col]=this.playerSymbol;
		}
	}
	
	void switchPlayer() {
		if (this.playerSymbol == 'X') {
			this.playerSymbol = '0';
		}
		else { 
			this.playerSymbol = 'X';
		}
		if (this.player.equals("Player1")) {
			this.player = "Player2";
		}
		else {
			this.player = "Player1";
		}
	}
	
	boolean checkLine(char[][] board) {
		boolean lineWin = false;
		for (int i = 0; i <=2 ; i++) {
			if (board[i][0] != '\u0000' && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
				lineWin = true;
				System.out.println(this.player+" wins!");
				break;
			}
		}
		return lineWin;
	}
	
	boolean checkColumn(char[][] board) {
		boolean columnWin = false;
		for (int j = 0; j <= 2; j++) {
			if (board[0][j] != '\u0000' && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
				columnWin=true;
				System.out.println(this.player+" wins!");
				break;
			}
		}
		return columnWin;
	}
	
	boolean checkDiagonals(char[][] board) {
		if (board[0][0]!= '\u0000' && board[0][0]==board[1][1] && board[1][1] == board[2][2]) {
			System.out.println(this.player+" wins!");
			return true;
		} 
		else {
			if (board[0][2] != '\u0000' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
				System.out.println(this.player+" wins!");
				return true;
			} 
			else {
				return false;
			}
		}
	}
	
	void initBoard() {
		for (int i = 0; i < tBoard.length; i++) {
			for (int j = 0; j < tBoard[0].length; j++) {
				tBoard[i][j]='\u0000';
			}
		}
	}
	
	boolean isWon() {
		if (checkLine(this.tBoard)) {
			return true;
		}
		else if (checkColumn(this.tBoard)) {
			return true;
		}
		else if (checkDiagonals(this.tBoard)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isFull() {
		boolean full = true;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (this.tBoard[i][j] == '\u0000') {
					full = false;
				}
			}
		}
		return full;
	}
	
	void printBoard(char[][] board) {
		System.out.println("-------------");
		for (int i = 0; i <= 2; i++) {
			System.out.print("| ");
			for (int j = 0; j <= 2; j++) {
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
}


