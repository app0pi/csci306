//Authors: Kenny Lieu, Baoviet(Jean) Duong

package levelPieces;

import gameEngine.Drawable; 
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class Queen extends GamePiece implements Moveable, Drawable {
	
	static Random rand = new Random();

	public Queen(int location) {
		super('Q', location);
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int randInt = rand.nextInt(2);
		//move right
		if (randInt == 0) {
			if (super.getLocation() < gameBoard.length - 2) {
				//if an entity is to the right of the Queen when attempting to move right, don't move
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
		public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
			//if the player is one square away from the Queen, they will be hit automatically
			if (Math.abs(playerLocation - super.getLocation()) == 1) {
				System.out.println("A QUEEN'S JOB IS TO PROTECT HER KING! SHE'S ALWAYS ON THE PROWL!");
				return InteractionResult.HIT;
			}
		return InteractionResult.NONE;
	}

		@Override
		//this function moves the character one space left or right in the array, as denoted by the changeMove argument
		public void swap(Drawable[] gameBoard, int changeMove) {
			gameBoard[super.getLocation() + changeMove] = gameBoard[super.getLocation()];
			gameBoard[super.getLocation()] = null;
		}
}
