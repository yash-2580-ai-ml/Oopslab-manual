class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void Details() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Cars extends Vehicle {
    int doors;
    int capacity;

    public Cars(String brand, int speed, int doors, int capacity) {
        super(brand, speed);
        this.doors = doors;
        this.capacity = capacity;
    }

    void cardetails() {
        System.out.println("Number of doors: " + doors);
        System.out.println("Capacity: " + capacity);
    }
}

class Bikes extends Vehicle {
    boolean gears;

    Bikes(String brand, int speed, boolean gears) {
        super(brand, speed);
        this.gears = gears;
    }

    void bikedetails() {
        if (gears)
            System.out.println("This bike has gears.");
        else
            System.out.println("This bike does not have a gear system.");
    }
}

class Trucks extends Vehicle {
    int tons;

    Trucks(String brand, int speed, int tons) {
        super(brand, speed);
        this.tons = tons;
    }

    void truckdetails() {
        System.out.println("The capacity of the truck is: " + tons + " tons");
    }
}

public class Rent {
    public static void main(String[] args) {

	System.out.println("yashaswi Reddy 24351 CSE-C");
        Cars c = new Cars("Toyota", 120, 5, 5);
        c.cardetails();
        c.Details();

        Bikes b = new Bikes("KTM", 80, true);
        b.bikedetails();
        b.Details();

        Trucks t = new Trucks("TATA", 100, 1);
        t.truckdetails();
        t.Details();
    }
}
