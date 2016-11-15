package model;

import javafx.scene.canvas.GraphicsContext;

public interface IRenderable {
	public int getZ();
	public boolean isVisible();
	public void render(GraphicsContext gc);
}
