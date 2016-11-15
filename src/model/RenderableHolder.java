package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.scene.image.Image;

public class RenderableHolder {
	
	private List<IRenderable> entities;
	private Comparator<IRenderable> comparator;
	static Image star;
	static Image[] arrow;
	private static final RenderableHolder instance = new RenderableHolder();
	
	public RenderableHolder(){
		entities = new ArrayList<>();
		comparator = (IRenderable o1, IRenderable o2) -> {
			if (o1.getZ() > o2.getZ()) {
				return 1;
			}
			return -1;
		};
		arrow = new Image[4];
	}
	
	static{
		loadResource();
	}
	
	public synchronized void add(IRenderable entity){
		instance.entities.add(entity);
		instance.entities.sort(comparator);
	}
	
	private static void loadResource() {
		//
		
		
		
		
		}
	
	public synchronized void remove(int index){
		instance.entities.remove(index);
	}

	public synchronized static RenderableHolder getInstance() {
		return instance;
	}

	public synchronized List<IRenderable> getEntities() {
		return entities;
	}
	
	public void setEntities(List<IRenderable> entities){
		instance.entities = entities;
	}
}