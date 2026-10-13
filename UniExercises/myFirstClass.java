import java.util.Scanner;
public class myFirstClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Birthday: ");
        String birthday = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
        scanner.close();
    }
}
