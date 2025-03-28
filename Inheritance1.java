package JavaOOPs;

class vehicle {
    double price;   // Attributes (properties)
    String colour;
    String name;
    int milage;

    public vehicle(double price, String colour, String name, int milage) {
        this.price = price;
        this.colour = colour;
        this.name = name;
        this.milage = milage;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Colour: " + colour);
        System.out.println("Milage: " + milage);
    }
}

class Car extends vehicle{
    int doors;
    String engine;
    int seats;

    public Car(double price, String colour, String name, int milage, int doors, String engine, int seats) {
        super(price, colour, name, milage);
        this.doors = doors;
        this.engine = engine;
        this.seats = seats;
    }
    public void displayCarDetails(){
        super.display();// we use this to inherit the vehicle properties as well
        System.out.println("Number of doors: " + doors);
        System.out.println("Engine: " + engine);
        System.out.println("Number of seats: " + seats);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Car c1 = new Car(2345, "black", "Mahendra",34, 4, "kawakashi", 7);
        c1.displayCarDetails();
        c1.display();
    }
}
