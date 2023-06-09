package Shapes;

import Shapes.abstractClass.Shape;
import interfaces.shapeInterfaces.Corners;

public class Rectangle extends Shape implements Corners {

	private int radiusCorners;

	public Rectangle(double startX, double startY, double endX, double endY,String nameOfShape,int radiusCorners) {
		super(startX, startY, endX, endY,nameOfShape);
		if(radiusCorners>0&&radiusCorners<90){
			this.radiusCorners=radiusCorners;
		}
	}

	@Override
	public String getBorderColor() {
		return "black";
	}

	@Override
	public String getBackgroundColor() {
		return "transparency";
	}

	@Override
	public int getRadiusCorners() {
		return radiusCorners;
	}

	@Override
	public int getCountCorners() {
		return 4;
	}

}
