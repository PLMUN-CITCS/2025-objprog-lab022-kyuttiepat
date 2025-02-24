// Car class definition
class Car {
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class with the main method
public class CarDemo {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car();

        // Assigning values to the Car attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Displaying car information
        myCar.displayInfo();
    }
}
