package model_entities;

import model_enums.Color;

public abstract class AbstractShape implements Shape {
//nao implemente area, somente shape pra ter o atrivuti cor
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
