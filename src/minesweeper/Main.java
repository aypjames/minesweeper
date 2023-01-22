package minesweeper;

import java.util.Scanner;

public class Main {
	
	int[][] minefield = new int[10][10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// Params =  amount of rows, amount of Columns, amount of mines.
        GameLogic game = new GameLogic(10, 10, 10);

        while (!game.isGameOver()) {
            printBoard(game);
            System.out.println("Enter row (1-10) and column (1-10) to reveal:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            game.reveal(row - 1, col - 1);
        }
        System.out.println("Boom! Game Over!");
        printBoard(game);
    }

    private static void printBoard(GameLogic game) {
        for (int i = 0; i < game.getRows(); i++) {
            for (int j = 0; j < game.getCols(); j++) {
                if (!game.isRevealed(i,j)) {
                    System.out.print("X ");
                } else if (game.isMine(i,j)) {
                    System.out.print("* ");
                } else {
                    System.out.print(game.adjacentMines(i,j) + " ");
                }
            }
            System.out.println();
        }
	
	}

}


//# Project: Minesweeper
//
//## MVP
//
//Recreate a simplified version of the game Minesweeper to be played in the java console
//The game should be able to randomly generate 10 mines in a 10x10 grid
//The user will be able to enter a command that represents a coordinate to check a location for a mine
//The application will display a number from 0-8 depending on how many mines surround that location
//If the user selects a mine, the game will respond "boom!" and the game will be lost
//If every non-mine square has been revealed, the game is won
//Render the grid to the console after every user command
//
//## Bonuses (optional)
//
//Allow for the user to configure number of mines and grid size via a configuration.json file
//(Difficult) Discovering an empty square should reveal all squares around it, and cascade into other nearby empty squares
