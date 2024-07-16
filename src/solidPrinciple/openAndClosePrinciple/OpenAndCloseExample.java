package solidPrinciple.openAndClosePrinciple;

interface Shape {
	double calculateArea();
}

class Circle implements Shape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Square implements Shape {
	private double side;
	
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double calculateArea() {
		return side * side;
	}
}

class Triangle implements Shape {
	private double base;
	private double height;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}
}

public class OpenAndCloseExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Square square = new Square();
        square.setSide(4);
        System.out.println("Square Area: " + square.calculateArea());

        Triangle triangle = new Triangle();
        triangle.setBase(3);
        triangle.setHeight(4);
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}

