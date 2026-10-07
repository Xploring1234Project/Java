// 1. The Interface (Common behavior)
interface Vehicle {
    void drive();
}

// 2. Concrete Class: Car
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a luxury Sedan!");
    }
}

// 3. Concrete Class: Bike
class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a fast Sportbike!");
    }
}

// 4. The Factory Class (The "Brain")
class VehicleFactory {
    // This method decides which object to create based on a String input
    public Vehicle getVehicle(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}

// 5. Main Class to run the program
public class FactoryPatternDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        // Use the factory to get a Car object
        Vehicle myVehicle1 = factory.getVehicle("CAR");
        myVehicle1.drive();

        // Use the factory to get a Bike object
        Vehicle myVehicle2 = factory.getVehicle("BIKE");
        myVehicle2.drive();
    }
}