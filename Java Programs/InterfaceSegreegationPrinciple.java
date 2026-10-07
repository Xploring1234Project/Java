// 1. Specific Interface for 2D calculations
interface AreaCalculatable {
    double calculateArea();
}

// 2. Specific Interface for 3D calculations
interface VolumeCalculatable {
    double calculateVolume();
}

// 3. Square only needs Area
class Square implements AreaCalculatable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// 4. Cube needs both Area and Volume
// Notice how it implements BOTH interfaces
class Cube implements AreaCalculatable, VolumeCalculatable {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * (side * side); // Surface area
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}

// 5. Main class to demonstrate segregation
public class InterfaceSegreegationPrinciple {
    public static void main(String[] args) {
        System.out.println("--- Interface Segregation Principle ---");

        AreaCalculatable mySquare = new Square(5);
        System.out.println("Square Area: " + mySquare.calculateArea());

        Cube myCube = new Cube(3);
        System.out.println("Cube Area: " + myCube.calculateArea());
        System.out.println("Cube Volume: " + myCube.calculateVolume());
    }
}