package JavaOOPs;

interface interfaceA{
    void display();
}

interface interfaceB {
    void display();
}

class C implements interfaceA, interfaceB{
    @Override
    public void display() {
        System.out.println("display() method from interfaceA and interfaceB");
    }
}


public class Interface1 {
    public static void main(String[] args) {
        C c = new C();
        c.display(); // Output: display() method from interfaceA and interfaceB
    }
}
