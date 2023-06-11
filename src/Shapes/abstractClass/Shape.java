package Shapes.abstractClass;

import interfaces.BackgroundColor;
import interfaces.Draw;
import interfaces.Zoom;

public abstract class Shape implements Zoom, Draw, BackgroundColor {
	private double startX;
	private double startY;
	private double endX;
	private double endY;
	private String  nameOfShape;

	public Shape(double startX, double startY, double endX, double endY, String nameOfShape) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.nameOfShape=nameOfShape;
	}

	@Override
	public void increase(int count) {
		System.out.println("Zoom in "+count+" percent");
	}

	@Override
	public void decrease(int count) {
		System.out.println("Zoom out "+count+" percent");
	}


	@Override
	public double getStartX() {
		return startX;
	}

	@Override
	public double getStartY() {
		return startY;
	}

	@Override
	public double getEndX() {
		return endX;
	}

	@Override
	public double getEndY() {
		return endY;
	}

	public String getNameOfShape() {
		return nameOfShape;
	}
}
