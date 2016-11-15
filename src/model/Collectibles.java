package model;

import javafx.scene.canvas.GraphicsContext;

public class Collectibles extends Entity {

	public Collectibles(double x, double y, int z) {
		super(x, y, z);
	}

	@Override
	public boolean isVisible() {
		return false;
	}

	@Override
	public void render(GraphicsContext gc) {
		// TODO Auto-generated method stub
	}

}
