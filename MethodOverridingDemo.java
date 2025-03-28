package JavaOOPs;

// Superclass
class Animall {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Subclass
class Dogg extends Animall {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
// Subclass
class Catt extends Animall {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
// Main class to demonstrate method overriding
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animall myAnimal;  // Declare an Animal reference
        // Create a Dog object
        myAnimal = new Dogg();
        myAnimal.sound(); // Outputs: Dog barks
        // Create a Cat object
        myAnimal = new Catt();
        myAnimal.sound(); // Outputs: Cat meows
    }
}
//
//Explanation of the Example:
//Superclass: The Animal class has a method sound() that provides a generic implementation.
//        Subclasses: The Dog and Cat classes extend Animal and override the sound() method to
//provide specific implementations for dogs and cats.
//Dynamic Method Dispatch: In the main method, the Animal reference myAnimal can point to
//different subclasses (Dog and Cat). When myAnimal.sound() is called, the appropriate overridden
//method is executed based on the actual object type.
