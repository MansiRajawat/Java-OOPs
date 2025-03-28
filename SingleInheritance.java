package JavaOOPs;

class employee{
    float Salary;
    String Name;

    public employee(float salary, String name) {
        Salary = salary;
        Name = name;
    }
    public void displayEmployeeInfo(){
        System.out.println("Name: " + Name + "\nSalary: " + Salary);
    }
}

class hr extends employee{
    float bonus;

    public hr(float salary, String name, float bonus) {
        super(salary, name);
        this.bonus = bonus;
    }
    public void displayhrdetails(){
        System.out.println("Name: " + Name + "\nSalary: " + Salary + "\nBonus: " + bonus);
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
    hr h = new hr(23.2F,"Mansi Singh", 24);
    h.displayEmployeeInfo();
    h.displayhrdetails();
    }
}
