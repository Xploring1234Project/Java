// 1. The Common Interface
interface Shape {
    void draw();
}

// 2. Concrete Implementation: Circle
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// 3. Concrete Implementation: Square
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

// 4. The Factory Class
// This is the "Brain" that decides which object to create.
class ShapeFactory {
    // Use getShape method to get object of type shape 
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

// 5. Main Class to demonstrate
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Square and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}