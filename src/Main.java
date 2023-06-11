import Shapes.Circle;
import Shapes.abstractClass.Shape;

public class Main {
	public static void main(String[] args) {



		Shape circle = new Circle(1,2,3,4,"Circle",5,"black","white");

		Printer printer = new Printer();
		printer.printInfo(circle);


//		Cube cube = new Cube(1, 2, 3, 52, "Cube",5, 10, "red", "white");
//		cube.getBorderColor();//red;
//		cube.getV();//500;
//
//
//		Triangle triangle = new Triangle(1,2,3,5,"Triangle","black",30);
//		triangle.getCountCorners();//3
//		triangle.getRadiusCorners();//30
//		triangle.getNameOfShape();//Triangle



	}
}
