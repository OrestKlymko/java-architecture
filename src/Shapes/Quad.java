package Shapes;

import Shapes.abstractClass.Shape;

public class Quad extends Shape {

	private String color;
	private String backgroundColor;
	public Quad(double startX, double startY, double endX, double endY,String color, String backgroundColor) {
		super(startX, startY, endX, endY);
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
	
	@Override
	public void getShapeName() {
		System.out.println("Quad");
	}
}
