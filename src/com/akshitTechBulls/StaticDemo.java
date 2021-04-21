package com.akshitTechBulls;

class Employee {
    int empId;
    float salary;
    static String ceo;

    //    It's execute only once unlike constructor. when you load a class
    static {
        ceo = "It's static method perform like constructor";
        System.out.println("Static method");
    }

    //    It's execute when you create a object
    Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
        System.out.println("Constructor");
    }

    void dataDisplay() {
        System.out.println("ID: " + empId + " Salary: " + salary + " CEO: " + ceo);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Employee ash = new Employee(101, 13000);
        Employee viral = new Employee(102, 15000);
//        ash.ceo = "Neha";
//        viral.ceo = "Urv";
        Employee.ceo = "Henna";
        ash.dataDisplay();
        viral.dataDisplay();
    }
}
