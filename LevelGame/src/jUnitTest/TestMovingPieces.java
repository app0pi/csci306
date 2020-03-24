//Authors: Kenny Lieu, Baoviet(Jean) Duong

package jUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.*;

public class TestMovingPieces {
	@Test
	public void testRandomMovementQueen() {

		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];

		for (int i=1;i<=5; i++)
			gameBoard[i] = new Pawn(' ');

		for (int i=7; i<=11; i++)
			gameBoard[i] = new Pawn(' ');

		for (int i=14; i<20; i++)
			gameBoard[i] = new Pawn(' ');

		Queen queen = new Queen('Q');
		gameBoard[6] = queen;
		int count = 0;
		queen.move(gameBoard, 6);

		if ( 6 != queen.getLocation()) 
		{
			count++;
		}
		// Ensure each option is randomly chosen some number of times. 
		System.out.println(queen.getLocation());
		assert(count > 0);	
	}

	@Test
	public void testRandomMovementBishop() {

		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];

		for (int i=1;i<=5; i++)
			gameBoard[i] = new Pawn(' ');

		for (int i=7; i<=11; i++)
			gameBoard[i] = new Pawn(' ');

		for (int i=14; i<20; i++)
			gameBoard[i] = new Pawn(' ');

		Bishop bishop = new Bishop('b');
		gameBoard[6] = bishop;
		int count = 0;
		bishop.move(gameBoard, 9);

		if ( 6 != bishop.getLocation()) 
		{
			count++;
		}
		// Ensure each option is randomly chosen some number of times. 
		System.out.println(bishop.getLocation());
		assert(count > 0);	
	}
}
