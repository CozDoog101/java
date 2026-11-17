
package HeshApp;

import java.util.LinkedList;
import java.util.Scanner;

public class HeshAppMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Person> people = new LinkedList<>();

        System.out.print("Enter number of users: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nUser " + (i + 1));

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            Person person = new Person(firstName, lastName, age, email);

            if (!people.contains(person)) {
                people.add(person);
                System.out.println("User successfully added!");
            } else {
                System.out.println("This user already exists!");
                i--;  
            }
        }
        System.out.println("\nTotal unique users added: " + people.size());
        scanner.close();

    }
}