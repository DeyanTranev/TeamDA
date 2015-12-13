package TicTacToeGame;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TicTacToe game = new TicTacToe();
		game.tBoard = new char[3][3];
		game.initBoard();
		game.printBoard(game.tBoard);
		while(!game.isFull()) {
			System.out.print(game.player+": ");
			game.row = sc.nextInt();
			game.col = sc.nextInt();
			game.playerMark(game.row, game.col);
			game.printBoard(game.tBoard);
			if(!game.isWon() ) {
				game.switchPlayer();
			}
			else {
				break;
			}
		}
		if (game.isFull() && !game.isWon()) {
			System.out.println("Draw!");
		}
		
		//game.printBoard(game.tBoard);
		//System.out.println(game.isWon());
		sc.close();
		

	}

}
