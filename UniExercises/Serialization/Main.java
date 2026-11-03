package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    private static final String FILE_NAME = "students.ser";

    public static void main(String[] args) {
        Student[] students = {
                new Student("Ivan", 12345, 5.50),
                new Student("Maria", 12346, 6.00),
                new Student("Peter", 12347, 4.75)
        };

        System.out.println("Original students:");
        printStudents(students);

        serializeStudents(students);

        students = null;

        students = deserializeStudents();

        if (students != null) {
            System.out.println("Restored students:");
            printStudents(students);
        }
    }

    private static void serializeStudents(Student[] students) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(students);
            System.out.println("\nStudents serialized successfully!\n");
        } catch (IOException e) {
            System.out.println("Error while serializing students: " + e.getMessage());
        }
    }

    private static Student[] deserializeStudents() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Student[] students = (Student[]) in.readObject();
            System.out.println("Students deserialized successfully!\n");
            return students;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while deserializing students: " + e.getMessage());
        }
        return null;
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
