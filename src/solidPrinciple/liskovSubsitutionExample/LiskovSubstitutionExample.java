package solidPrinciple.liskovSubsitutionExample;

class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    
    public void hii() {
        System.out.println("Hii");
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
    
    public void hello() {
        System.out.println("Hello");
    }
}


public class LiskovSubstitutionExample {
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

    public static void main(String[] args) {
    	Shape rectangle = new Rectangle(4, 5); //using parent reference to store child object
        Shape square = new Square(4);

        printArea(rectangle); // Output: Area: 20.0
        printArea(square);    // Output: Area: 16.0
    }
}


