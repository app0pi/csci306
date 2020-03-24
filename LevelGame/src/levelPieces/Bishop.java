//Authors: Kenny Lieu, Baoviet(Jean) Duong

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.*;

public class Bishop extends GamePiece implements Drawable, Moveable {

	private boolean givenPrize = false;
	static Random rand = new Random();

	public Bishop(int location) {
		super('b', location);
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int randInt = rand.nextInt(1);
		//move right
		if (randInt == 0) {
			if (super.getLocation() < gameBoard.length - 2) {
				//if an entity is to the right of the Bishop when attempting to move right, don't move
				if (gameBoard[super.getLocation() + 1] != null || (playerLocation == super.getLocation() +1)){
					return;
				}
					
				//set the new location and swap it in the array
				swap(gameBoard, 1);
				super.setLocation(super.getLocation() + 1);
				}
			}
		//move left
		else {
			if (super.getLocation() > 0) {
			//same structure applies here as above
			if (gameBoard[super.getLocation() - 1] != null || (playerLocation == super.getLocation() - 1)){ 
				return;
			}
			
			swap(gameBoard, -1);
			super.setLocation(super.getLocation() - 1);
			
			}		
		}
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (Math.abs(playerLocation - super.getLocation()) <= 1) {
			System.out.println("CONGRATULATION! By defeating the Bishop you recieved EXCALIBUR!");
		}
		if (!givenPrize && Math.abs(playerLocation - super.getLocation()) == 2){

			System.out.println("The Bishop challenges you! There might be a reward if you win.");
			givenPrize = true;
			return InteractionResult.GET_POINT;
		}

		return InteractionResult.NONE;
	}

	@Override
	public void swap(Drawable[] pieces, int changeMove) {
		pieces[super.getLocation() + changeMove] = pieces[super.getLocation()];
		pieces[super.getLocation()] = null;
	}

}
