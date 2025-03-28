package JavaOOPs;

// Superclass
class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Subclass 1
class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
// Subclass 2
class Cats extends Animals {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
// Subclass 3
class Cows extends Animals {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}
// Main class to demonstrate hierarchical inheritance
public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Cats cat = new Cats();
        Cows cow = new Cows();
        dog.sound(); // Output: Dog barks
        cat.sound(); // Output: Cat meows
        cow.sound(); // Output: Cow moos
    }
}