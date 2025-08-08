package day3;

public abstract class Shape {
	String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();
    abstract double perimeter();

    public void displayColor() {
        System.out.println("Shape Color: " + color);
    }
}
class Circle extends Shape {
    private double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}