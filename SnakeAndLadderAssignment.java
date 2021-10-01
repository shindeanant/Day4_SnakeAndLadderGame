package com.snakeandladderGamee;

public class SnakeAndLadderAssignment {
	static int position = 0;

	public void startGame() { /** instance method */
		System.out.println("Position of player at start is " + position);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Snake and Ladder Game:");

		SnakeAndLadderAssignment object = new SnakeAndLadderAssignment(); /** Object creation */
		object.startGame(); /*** Calling method */

	}

}
