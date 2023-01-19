package minesweeper;

public class Main {
	
	int[][] minefield = new int[10][10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// logic to build minefield
			// randomly allocate mines
		
		// logic to playgame
		   // get user input coordinates - column (Num) and row (Char) number based on 10 x 10 grid. 
		   // if coordinate is bomb - response boom and return game lost
			// else continue game and get new coordinates inputs from user. 
			// if all non-mine square are revealed, return game is won! and play new game. 
		// //
		// comment 
	
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
