//Authors: Kenny Lieu, Baoviet(Jean) Duong

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class King extends GamePiece implements Drawable {

	public King(int location) {
		super('*', location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if (playerLocation == super.getLocation()) {
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}

}
