import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BookStack stack = new BookStack(2);

            int choice;

            do {
                System.out.println("\n=== BOOK STACK MENU ===");
                System.out.println("1. Add book");
                System.out.println("2. Remove book");
                System.out.println("3. Search books by minimum price");
                System.out.println("4. Print stack information");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> {
                        System.out.print("Book title: ");
                        String title = scanner.nextLine();

                        System.out.print("Book author: ");
                        String author = scanner.nextLine();

                        System.out.print("Book price: ");
                        double price = Double.parseDouble(
                            scanner.nextLine()
                        );

                        Book book = new Book(title, author, price);
                        stack.push(book);
                        System.out.println("Book added.");
                    }

                    case 2 -> {
                        Book removed = stack.pop();
                        if (removed == null) {
                            System.out.println("The stack is empty.");
                        } else {
                            System.out.println("Removed: " + removed);
                        }
                    }

                    case 3 -> {
                        System.out.print("Minimum price: ");
                        double minPrice = Double.parseDouble(
                            scanner.nextLine()
                        );

                        stack.searchByPrice(minPrice);
                    }

                    case 4 -> {
                        stack.printStackInformation();
                    }

                    case 0 -> {
                        System.out.println("Goodbye!");
                    }

                    default -> {
                        System.out.println("Invalid option!");
                    }
                }

            } while (choice != 0);
        }
    }
}
