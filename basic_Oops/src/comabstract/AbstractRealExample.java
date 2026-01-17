package comabstract;


abstract class Employee {

    int id;
    String name;

    // constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateSalary();   // different for each employee

    void display() {                      // common for all
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Developer extends Employee {

    Developer(int id, String name) {
        super(id, name);
    }

    double calculateSalary() {
        return 30000 + 5000;  // basic + bonus
    }
}

class Manager extends Employee {

    Manager(int id, String name) {
        super(id, name);
    }

    double calculateSalary() {
        return 50000 + 10000; // basic + incentive
    }
}

public class AbstractRealExample {
    public static void main(String[] args) {

        Employee e1 = new Developer(101, "Rahul");
        e1.display();
        System.out.println("Salary: " + e1.calculateSalary());

        System.out.println();

        Employee e2 = new Manager(102, "Neha");
        e2.display();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
