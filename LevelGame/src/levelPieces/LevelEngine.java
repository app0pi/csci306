//Authors: Kenny Lieu, Baoviet(Jean) Duong

package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

public class LevelEngine {
	private String startLoc;
	private int pLocation;

	// Each level has a 1D array of pieces that can be drawn
	private Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	// Only some pieces can move.
	private ArrayList<Moveable> movingPieces = new ArrayList<Moveable>();
	// Only game pieces interact
	private ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();

	public void createLevel(int levelNum) {
		switch(levelNum) {
		case 1:
			startLoc = "P  Q k.b    . r r  k*";
			break;
		case 2:
			startLoc = "Pk k.  b  . w  QQ k.*";
			break;
		}

		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<Moveable>();
		interactingPieces = new ArrayList<GamePiece>();

		for (int i = 0; i < gameBoard.length; i++) {
			switch(startLoc.charAt(i)) {
			case 'P':
				pLocation = i;
			case ' ':
				gameBoard[i] = null;
				break;
			case 'r':
				gameBoard[i] = new Rook(i);
				interactingPieces.add((GamePiece) gameBoard[i]);
				break;
			case 'Q':
				gameBoard[i] = new Queen(i);
				movingPieces.add((Moveable) gameBoard[i]);
				interactingPieces.add((GamePiece) gameBoard[i]);
				break;
			case 'b':
				gameBoard[i] = new Bishop(i);
				movingPieces.add((Moveable) gameBoard[i]);
				interactingPieces.add((GamePiece) gameBoard[i]);
				break;
			case '.':
				gameBoard[i] = new Pawn(i);
				break;
			case '*':
				gameBoard[i] = new King(i);
				interactingPieces.add((GamePiece) gameBoard[i]);
				break;
			case 'k':
				gameBoard[i] = new Knight(i);
				interactingPieces.add((GamePiece) gameBoard[i]);
				break;
			}

		}

	}

	public Drawable[] getBoard() {
		return gameBoard;
	}

	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}

	public int getPlayerStartLoc() {
		return pLocation;
	}

}
