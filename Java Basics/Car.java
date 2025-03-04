//create a car class with attributes (branch,model,speed)and methods to 
// acclearte and brake)
 public class Car {
    // Attributes
    String branch;
    String model;
    int speed;


    // Constructor to initialize the car's brand and model
    public Car(String branch, String model,int speed) {
        this.branch = branch;
        this.model = model;
        this.speed = 0;  // Speed starts at 0
    }

    // Method to accelerate the car
    public void accelerate(int increment) {
        speed += increment;
        System.out.println("The car is now going at " + speed + " km/h.");
    }

    // Method to brake the car
    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0; // Prevent negative speed
        System.out.println("The car is now going at " + speed + " km/h.");
    }

    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Toyota", "Corolla");


        // Accelerate and brake the car
        myCar.accelerate(20);  // Increase speed by 20 km/h
        myCar.brake(10);       // Decrease speed by 10 km/h
    }
}