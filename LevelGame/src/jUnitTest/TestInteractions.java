//Authors: Kenny Lieu, Baoviet(Jean) Duong

package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.*;

public class TestInteractions {
	@Test
	void testValQueen() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Queen queen = new Queen(10);
        gameBoard[10] = queen;
        //test if queen is on squares 1-9 (does nothing):
        for (int i=0; i<9; i++)
            assertEquals(InteractionResult.NONE, queen.interact(gameBoard, i));
        //test if queen is on square 9 (hit):
        assertEquals(InteractionResult.HIT, queen.interact(gameBoard, 9));
        //test if queen is on square 10 (does nothing):
        assertNotEquals(InteractionResult.HIT, queen.interact(gameBoard, 10));
        //test if queen is on square 11 (hit):
        assertEquals(InteractionResult.HIT, queen.interact(gameBoard, 11));
        //test if queen is on square 12 or after (nothing):
        for (int i=12; i<GameEngine.BOARD_SIZE; i++)
            assertEquals(InteractionResult.NONE, queen.interact(gameBoard, i));
	}
	
	@Test
	void testValKnight() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Knight knight = new Knight(10);
        gameBoard[10] = knight;
        
        //if knight on same square then kill otherwise nothing happens
        for (int i=0; i<GameEngine.BOARD_SIZE; i++) {
        	if(i==10)
        		assertEquals(InteractionResult.KILL, knight.interact(gameBoard, i));
        	else
        		assertEquals(InteractionResult.NONE, knight.interact(gameBoard, i));
        }
	}
	
	@Test
	void testValKing() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        King king = new King(10);
        gameBoard[10] = king;
        
        //if king on same square then advance otherwise nothing happens
        for (int i=0; i<GameEngine.BOARD_SIZE; i++) {
        	if(i==10)
        		assertEquals(InteractionResult.ADVANCE, king.interact(gameBoard, i));
        	else
        		assertEquals(InteractionResult.NONE, king.interact(gameBoard, i));
        }
	}
	
	@Test
    public void testValBishop() {
        Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Bishop bishop = new Bishop(12);
        gameBoard[10] = bishop;

        //if interacts at 2 less than bishop location then get point otherwise nothing
        assertEquals(InteractionResult.GET_POINT, bishop.interact(gameBoard, 10));

        for (int i=0; i<10; i++)
            assertEquals(InteractionResult.NONE, bishop.interact(gameBoard, i));
        for (int i=11; i<GameEngine.BOARD_SIZE; i++)
            assertEquals(InteractionResult.NONE, bishop.interact(gameBoard, i));
    }
	
}
