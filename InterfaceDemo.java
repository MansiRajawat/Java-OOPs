package JavaOOPs;
interface Vehicle1 {
    public void test();
}
class Car1 implements Vehicle1 {
    public void test() {
        System.out.println("This is a Car");
    }
}
class Car2 implements Vehicle1 {
    public void test() {
        System.out.println("This is a Car2");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle1 car = new Car1();  // Use uppercase 'Car'
        car.test();
        Vehicle1 car2 = new Car2(); // Use uppercase 'Car2'
        car2.test();
    }
}
