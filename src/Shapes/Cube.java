package Shapes;

import interfaces.shapeInterfaces.ThreeDimension;

public class Cube extends Quad implements ThreeDimension {

	private double startZ;
	private double endZ;


	public Cube(double startX, double startY, double endX, double endY,double startZ, double endZ,String color, String backgroundColor) {
		super(startX, startY, endX, endY, color, backgroundColor);
		this.startZ=startZ;
		this.endZ=endZ;
	}

	@Override
	public double getStartZ() {
		return startZ;
	}

	@Override
	public double getEndZ() {
		return endZ;
	}

	@Override
	public double getV() {
		return Math.abs(getEndX() - getStartX()) * (getEndY() - getStartY()) * (getEndZ()-getStartZ());
	}
	
	@Override
	public void getShapeName() {
		System.out.println("Cube");
	}
}
