package SyntaxClass19SuperKewWords;

public class Employee {
    String name;
    int age;
    int salary = 30000;
    int baseNoDaysOff = 20;

    void printSalary() {
        System.out.println(salary);
    }

    void printNoDayOff() {
        System.out.println(baseNoDaysOff);
    }
}
    class Manager extends Employee {
        int salary=50000;
        int bonus = 10;
        int travalingAllowance = 200;
        void printSalary() {
            super.printSalary();
            System.out.println(bonus + travalingAllowance+super.salary);// if we use super here we will get the salary
            //from parent class if we use just salry then we will get salary from child class


    }
}