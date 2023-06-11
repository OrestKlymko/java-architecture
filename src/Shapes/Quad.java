package Shapes;

import Shapes.abstractClass.Shape;

public class Quad extends Shape {

	private String color;
	private String backgroundColor;
	public Quad(double startX, double startY, double endX, double endY,String nameOfShape,String color, String backgroundColor) {
		super(startX, startY, endX, endY,nameOfShape);
		this.backgroundColor=backgroundColor;
		this.color=color;
	}

	@Override
	public String getBorderColor() {
		return color;
	}

	@Override
	public String getBackgroundColor() {
		return backgroundColor;
	}

}
