//Authors: Kenny Lieu, Baoviet(Jean) Duong

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Knight extends GamePiece {

	public Knight(int location) {
		super('k', location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		
		if (playerLocation == super.getLocation()) {
			System.out.println("KNIGHTS CAN KILL YOU IN ONE HIT!");
			return InteractionResult.KILL;
		}
		return InteractionResult.NONE;
	}

}
