package JavaOOPs;
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("I am an animal and I speak.");
    }
}
class Dog extends Animal {
    String breed;
    int age;
    public Dog(String name, String breed, int age) {
        super(name);
        this.breed = breed;
        this.age = age;
    }
    @Override
    public void speak() {
        // Call the base class speak method to print the animal's speak message
        super.speak(); // This prints "I am an animal and I speak."
        System.out.println("I am " + name + ", a " + breed + " dog, " + age + " years old.");
        System.out.println("I bark.");
    }
}
class Cat extends Animal {
    String color;
    String age;
    public Cat(String name, String color, String age) {
        super(name);
        this.color = color;
        this.age = age;
    }
    @Override
    public void speak() {
        // Call the base class speak method to print the animal's speak message
        super.speak(); // This prints "I am an animal and I speak."
        System.out.println("I am " + name + ", a " + color + " cat, " + age + " years old.");
        System.out.println("I meow.");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Dog d1 = new Dog("Gracie", "Labrador", 5);
        d1.speak();

        Cat c1 = new Cat("Whiskers", "Black", "3");
        c1.speak();
    }
}