package Shapes;


import Shapes.abstractClass.Shape;
import interfaces.shapeInterfaces.Radius;

public class Circle extends Shape implements Radius {
	private double radius;
	private String color;
	private String backgroundColor;

	public Circle(double startX, double startY, double endX, double endY,String nameOfShape,double radius,String color, String backgroundColor) {
		super(startX, startY, endX, endY, nameOfShape);

		this.radius=radius;
		this.color = color;
		this.backgroundColor = backgroundColor;
	}

	@Override
	public String getBorderColor() {
		return color;
	}

	@Override
	public String getBackgroundColor() {
		return backgroundColor;
	}

	@Override
	public double radius() {
		return radius;
	}

}
