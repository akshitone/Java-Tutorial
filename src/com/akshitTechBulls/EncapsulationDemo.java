package com.akshitTechBulls;

class Student {

    private int rollNo;
    private String name;

    //Getter and Setters
    //Concept: Binding variables / data with methods. (You can't use variables directly)

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Value is changed stores in log file!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNo(101);
        student.setName("Akihito");
        System.out.println(student.getRollNo());
        System.out.println(student.getName());
    }
}
