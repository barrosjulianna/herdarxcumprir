package application;


import model_entities.AbstractShape;
import model_entities.Circle;
import model_entities.Rectangle;
import model_entities.Shape;
import model_enums.Color;

public class Program {

	public static void main(String[] args) {
		//POLIMORFISMO
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2= new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle Color: "+ s1.getColor());
		System.out.println("Circle Area: "+ String.format("%.3f", s1.area()));
		System.out.println("Rectangle Color: "+ s2.getColor());
		System.out.println("Rectangle Area: "+ String.format("%.3f", s2.area()));
	}

}
