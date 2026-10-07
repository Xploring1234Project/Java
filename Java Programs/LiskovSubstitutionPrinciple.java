// 1. The Base Abstraction
// We focus on what all shapes can DO (calculate area), 
// not how their dimensions are set.
interface Shape {
    double getArea();
}

// 2. Rectangle implementation
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// 3. Square implementation
// Note: Square no longer "is-a" Rectangle in terms of setters.
// It is its own shape that fulfills the "Shape" contract.
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

// 4. The LSP Demo Class
public class LiskovSubstitutionPrinciple {
    
    // This method works for ANY Shape. 
    // It doesn't care if it's a Square or Rectangle; 
    // it just knows it can get an area.
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        // Substitutability in action:
        // We can treat both Square and Rectangle as a 'Shape' 
        // without unexpected side effects.
        Shape myRect = new Rectangle(5, 10);
        Shape mySquare = new Square(5);

        System.out.println("--- Liskov Substitution Principle ---");
        printArea(myRect);   // Expected: 50.0
        printArea(mySquare); // Expected: 25.0
    }
}