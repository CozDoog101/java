import java.util.ArrayList;
import java.util.Scanner;

interface validater {
    String getUsername();
    String getPassword();
}
class InvalidOptionException extends Exception {
    public InvalidOptionException(String m) {
        super(m);
    } 
}
class InvalidPasswordLengthException extends Exception {
    public InvalidPasswordLengthException(String m) {
        super(m);
    } 
}
public abstract class checking implements validater {

    private final String Username;
    private final String Password;

    public checking(String Username, String Password) throws InvalidPasswordLengthException {
        if (Username == null || Password == null) {
            throw new IllegalArgumentException("Username and Password cannot be null");
        }
        if (!Username.contains("@")) {
            throw new IllegalArgumentException("Username has to contain '@'");
        }
        if (Password.length() < 3) {
            throw new InvalidPasswordLengthException("Password must be at least 3 characters long");
        }
        this.Username = Username;
        this.Password = Password;
    }

    @Override
    public String getUsername() {
        return Username;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    public static void main(String[] args) throws InvalidOptionException, InvalidPasswordLengthException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add user");
            System.out.println("2. Show all users");
            System.out.println("3. Exit");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        try {
                            System.out.print("Enter username: ");
                            String username = scanner.nextLine();

                            System.out.print("Enter password: ");
                            String password = scanner.nextLine();

                            User user = new User(username, password);
                            users.add(user);

                            System.out.println("User added successfully!");

                        } catch (InvalidPasswordLengthException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        if (users.isEmpty()) {
                            System.out.println("No users found.");
                        } else {
                            System.out.println("\n===== ALL USERS =====");

                            for (int i = 0; i < users.size(); i++) {
                                System.out.println(
                                    (i + 1) + ". " + users.get(i)
                                );
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Exiting program...");
                        break;

                    default:
                     throw new InvalidOptionException("Invalid choice. Please choose 1, 2, or 3.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        scanner.close();
    }
}
