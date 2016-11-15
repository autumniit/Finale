package model;

import javafx.scene.canvas.GraphicsContext;

public class EnemyShip extends Ship {

	public EnemyShip(double x, double y, int z, int hp, double movespeed) {
		super(x, y, z, hp, movespeed);
		
	}

	public void takeDamage(int damage) {
		hp = hp - damage;
	}
	
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void render(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
	}
	

}
