package com.snakeandladderGamee;

import java.util.Random;

public class SnakeAndLadderAssignment {
	static int position = 0;
	static Random random = new Random();

	public static int getDiceRollNumber() { // generating random number between 1 to 6
		int randomNumber = random.nextInt(6) + 1;
		return randomNumber;
	}

	void checkOption() {

		while (position <= 100) {
			int getRandom = getDiceRollNumber();
			int randomOption = random.nextInt(3);
			System.out.println("Number received after rolling dice is" + getRandom);
			switch (randomOption) {
			case 0:
				position = position;
				System.out.println("Position of player at no play is " + position);
				break;
			case 1:
				position = position + getRandom;
				System.out.println("Position of player after climbing ladder is " + position);
				break;
			case 2:
				if (position - getRandom <= 0) {
					position = 0;
				} else {
					position = position - getRandom;
					System.out.println("Position of player after stepping on snake  is " + position);
					break;
				}

				if (position > 100) { // if position is greater than 100 it will roll back to previous value
					position = position - getRandom;
				} else if (position == 100) {
					System.out.println("Player wins");
					break;
				} else {
					position = position;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Snake and Ladder Game:");

		SnakeAndLadderAssignment object = new SnakeAndLadderAssignment(); /** Object creation */
		object.checkOption(); /*** Calling method */

	}

}
