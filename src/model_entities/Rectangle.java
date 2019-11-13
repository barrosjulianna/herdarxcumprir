package model_entities;

import model_enums.Color;

public class Rectangle extends AbstractShape{

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width=width;
		this.height=height;
	}
	
	private Double width;
	private Double height;
	//sobrescreve a operação area
	@Override
	public double area() {
		return width*height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	
	
}
