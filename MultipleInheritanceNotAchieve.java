package JavaOOPs;

// we canot directly achieve the multiple inheritance in java due to this issue it gives you error(Class cannot extend multiple classes)
class A {
    void display() {
        System.out.println("Display from A");
    }
}
class B extends A {
    void display() {
        System.out.println("Display from B");
    }
}
class C extends A {
    void display() {
        System.out.println("Display from C");
    }
}
// This would cause ambiguity
class D extends B, C { // Not allowed in Java
}