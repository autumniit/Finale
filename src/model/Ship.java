package model;

public abstract class Ship extends Entity {

	protected int hp = 0;
	protected double movespeed = 0;

	public Ship(double x, double y, int z, int hp, double movespeed) {
		super(x, y, z);
		this.movespeed = movespeed;
		this.hp = hp;
	}

	public boolean isDead() {
		return hp <= 0;
	}

}
