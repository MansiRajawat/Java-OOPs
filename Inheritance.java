package JavaOOPs;

class parentclass{
    void display(){
        System.out.println("Parent class properties");
    }
}

class childclass extends parentclass{
    void show(){
        System.out.println("Child class properties");
    }
}

public class Inheritance {
    public static void main(String[] args) {
      childclass ch1 = new childclass();
      ch1.show();
      ch1.display();
    }
}
