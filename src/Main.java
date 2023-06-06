import Shapes.Circle;
import Shapes.Cube;
import Shapes.Triangle;
import Shapes.abstractClass.Shape;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle(1,2,3,4,5,"black","white");
		circle.getBackgroundColor();//white
		circle.increase(50);//Zoom in 50 percent


		Cube cube = new Cube(1, 2, 3, 52, 5, 10, "red", "white");
		cube.getBorderColor();//red;
		cube.getV();//500;
		cube.getShapeName();//Cube


		Triangle triangle = new Triangle(1,2,3,5,"black",30);
		triangle.getCountCorners();//3
		triangle.getRadiusCorners();//30
		triangle.getShapeName();//Triangle



	}
}
