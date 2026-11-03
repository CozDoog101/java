package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int facultyNumber;
    private double grade;

    public Student(String name, int facultyNumber, double grade) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, Faculty No: %d, Grade: %.2f", name, facultyNumber, grade);
    }
}
