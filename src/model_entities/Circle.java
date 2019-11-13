package model_entities;

import model_enums.Color;

public class Circle extends AbstractShape {

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

//circulo herda shape e tem o metodo abstrato area pra criar
	@Override
	public double area() {

		return Math.PI * radius * radius;
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
