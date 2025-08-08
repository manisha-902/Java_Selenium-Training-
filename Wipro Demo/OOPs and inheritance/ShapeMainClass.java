package day3;

public class ShapeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle(5, "Red");
		Shape r = new Rectangle(4, 6, "Blue");

		System.out.println("Circle Details:");
		c.displayColor();
		System.out.println("Area: " + c.area());
		System.out.println("Perimeter: " + c.perimeter());

		System.out.println("\nRectangle Details:");
		r.displayColor();
		System.out.println("Area: " + r.area());
		System.out.println("Perimeter: " + r.perimeter());
	}
}

