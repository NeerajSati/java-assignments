// 02220902719
// Sai Prashant Saxena

// Write an abtract class Employee with three variables name, sal and Grosssal , suitable
// constructors, print method and two abstract methods calculategrosssalary() and
// annualincrement(). Create a manager sub class of employee with Hra as member
// variable and write implimentation of the abstract method. Also create a subclass of
// manager as sales manger with commision as member variable and override the
// calulategrosssalary() method.

package assignment3;

abstract class Employee {
    String name;
    int salary, grossSalary;

    public abstract int calculategrosssalary();

    public abstract int annualIncrement();

}

class Manager extends Employee {
    Manager() {
        super();
    }

    Manager(String name, int salary, int grossSalary) {
        this.name = name;
        this.salary = salary;
        this.grossSalary = grossSalary;
    }

    public int calculategrosssalary() {
        return grossSalary;
    }

    public int annualIncrement() {
        return 15;
    }
}

class SubManager extends Manager {
    SubManager(String name, int salary, int grossSalary) {
        super(name, salary, grossSalary);
    }

    public int calculategrosssalary() {
        return grossSalary + 2000;
    }
}

public class ques5 {
    public static void main(String[] args) {
        Manager har = new Manager("Kailash", 10000, 11000);
        System.out.println(har.calculategrosssalary());
        SubManager sub = new SubManager("Kailash", 10000, 11000);
        System.out.println(sub.calculategrosssalary());
    }
}
