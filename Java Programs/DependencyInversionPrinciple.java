// 1. The Abstraction (The "Interface")
// Both high-level and low-level classes will depend on this.
interface Shape {
    double getArea();
    String getName();
}

// 2. Low-level module: Rectangle
// This is a "detail" that implements the abstraction.
class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double w, double h) { this.width = w; this.height = h; }
    
    @Override
    public double getArea() { return width * height; }
    
    @Override
    public String getName() { return "Rectangle"; }
}

// 3. Low-level module: Circle
class Circle implements Shape {
    private double radius;
    public Circle(double r) { this.radius = r; }
    
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    
    @Override
    public String getName() { return "Circle"; }
}

// 4. High-level module: ShapePrinter
// It does NOT know about Rectangle or Circle. 
// It only knows about the Shape interface.
class ShapePrinter {
    private Shape shape;

    // Dependency Injection: We "inject" the dependency via the constructor
    public ShapePrinter(Shape shape) {
        this.shape = shape;
    }

    public void display() {
        System.out.println("Displaying " + shape.getName() + " with area: " + shape.getArea());
    }
}

// 5. Main class to tie it all together
public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        // We create the "detail" (Circle)
        Shape myCircle = new Circle(5);
        
        // We inject it into the high-level module (Printer)
        // The Printer doesn't care that it's a circle!
        ShapePrinter printer = new ShapePrinter(myCircle);
        printer.display();

        // We can easily swap it for a Rectangle without changing ShapePrinter code
        Shape myRect = new Rectangle(10, 2);
        ShapePrinter secondPrinter = new ShapePrinter(myRect);
        secondPrinter.display();
    }
}