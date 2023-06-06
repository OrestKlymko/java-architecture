package Shapes;

import Shapes.abstractClass.Shape;
import interfaces.shapeInterfaces.Corners;

public class Triangle extends Shape implements Corners {
	private String backgroundColor;
	private int radiusCorners;
	public Triangle(double startX, double startY, double endX, double endY,String backgroundColor,int radiusCorners) {
		super(startX, startY, endX, endY);
		this.backgroundColor=backgroundColor;
		this.radiusCorners=radiusCorners;
	}

	@Override
	public String getBorderColor() {
		return "black";
	}

	@Override
	public String getBackgroundColor() {
		return backgroundColor;
	}

	@Override
	public int getRadiusCorners() {
		return radiusCorners;
	}

	@Override
	public int getCountCorners() {
		return 3;
	}
}
