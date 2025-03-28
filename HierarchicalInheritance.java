package JavaOOPs;
class A {
    void display() {
        System.out.println("Class A");
    }
}
class B extends A {
    void display() {
        System.out.println("Class B");
    }
}
class c extends A { // Renamed from 'c' to 'C'
    @Override
    void display() {
        System.out.println("Class C");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        B obj = new B();
        c obj1 = new c(); // Renamed from 'c' to 'C'

        obj.display();  // This will call display() from class B
        obj1.display(); // This will call display() from class C
    }
}