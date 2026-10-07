// 1. The Shape Interface (Open for extension)
interface Shape {
    double calculateArea();
}

// 2. Concrete implementation: Rectangle
class Rectangle implements Shape {
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
}

// 3. Concrete implementation: Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 4. The AreaCalculator (Closed for modification)
// We don't need to change this class when we add new shapes!
class AreaCalculator {
    public double totalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }
        return total;
    }
}

// 5. Main Class to run the code
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        // Create an array of different shapes
        Shape[] shapes = {
            new Rectangle(10, 5),
            new Circle(7),
            new Rectangle(2, 3)
        };

        AreaCalculator calculator = new AreaCalculator();
        double total = calculator.totalArea(shapes);

        System.out.println("--- Area Calculation ---");
        System.out.printf("Total Area of all shapes: %.2f\n", total);
    }
}