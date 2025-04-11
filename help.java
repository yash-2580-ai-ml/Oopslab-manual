class Vehicle {
    String brand;
    int speed;

    public Vehicle() {
        this.brand = "Unknown";
        this.speed = 0;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    String model;
    String company;
    int mileage;
    String fuelType;

    public Car(String brand, int speed, String model, String company, int mileage, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.model = model;
        this.company = company;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Help {
    public static void main(String[] args) {
	System.out.println("yashaswi Reddy 24351 CSE-C");
        Car car = new Car("Toyota", 120, "Corolla", "Toyota", 18, "Petrol");
        car.displayInfo();
    }
}
