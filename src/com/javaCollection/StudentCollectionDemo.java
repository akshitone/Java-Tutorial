package com.javaCollection;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return rollNo > student.rollNo ? 1 : -1;
    }
}

public class StudentCollectionDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(103, "Tom"));
        studentList.add(new Student(101, "Chris"));
        studentList.add(new Student(102, "Robert"));

        for (Student student : studentList)
            System.out.println(student);
    }
}
