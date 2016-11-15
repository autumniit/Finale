package model;

import javafx.scene.canvas.GraphicsContext;

public class PlayerShip extends Ship {

	protected int armor;
	protected int armorRegenRate;

	public PlayerShip(double x, double y, int z, int hp, double movespeed, int armor, int armoreRegenRate) {
		super(x, y, z, hp, movespeed);
		this.armor = armor;
		this.armorRegenRate = armoreRegenRate;
	}
	
	public boolean isUnarmored() {
		return armor <= 0;
	}

	public void takeDamage(int damage) {
		hp = hp - damageReducedByArmor(damage);
	}

	public int damageReducedByArmor(int damage) {
		if (damage >= armor) {
			damage = damage - armor;
			armor = 0;
			return damage;
		} else {
			armor = armor - damage;
			return 0;
		}
	}

	public void regainArmor() {
		armor = armor + armorRegenRate;
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
