//Authors: Kenny Lieu, Baoviet(Jean) Duong

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Rook extends GamePiece implements Drawable{

	public Rook(int location) {
		super('r', location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if (playerLocation == super.getLocation()) {
			System.out.println("RUN AWAY, YOU JUST GOT HIT BY A ROOK!");
			return InteractionResult.HIT;
		} 
		return InteractionResult.NONE;
	}

}
