package com.snakeandladderGamee;

import java.util.Random;

public class SnakeAndLadderAssignment {
	static int position = 0;

	public void startGame() { /** instance method */
		System.out.println("Position of player at start is " + position);
	}

	void getRandomNumber() {

		Random random = new Random();
		int randomNumber = 1;
		if (randomNumber > 0) {
			/** generating random number between 1 to 6 */

			randomNumber = random.nextInt(7);
			System.out.println(randomNumber);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Snake and Ladder Game:");

		SnakeAndLadderAssignment object = new SnakeAndLadderAssignment(); /** Object creation */
		object.startGame(); /*** Calling method */
		object.getRandomNumber();

	}

}
