package WorkingWithString;
import java.util.Scanner;

public class StringAppMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TextEditor editor = new TextEditor();

            int choice = -1;

            do {
                System.out.println("\n=== TEXT EDITOR MENU ===");
                System.out.println("1. Add text");
                System.out.println("2. Print the count of words and symbols");
                System.out.println("3. Search text by keyword");
                System.out.println("4. Reverse the text");
                System.out.println("5. Count emails in the text");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter text ");
                        editor.addText(scanner);
                        break;
                    }
                    case 2 ->{
                        editor.printCount();
                        break;
                    } 
                    case 3 -> {
                        System.out.print("Search keyword: ");
                        String keyword = scanner.nextLine();
                        editor.searchTextByKeyword(keyword);
                        break;
                    }
                    case 4 -> {
                        editor.reverseText();
                        break;
                    }
                    case 5 -> {
                        editor.searchCountOfEmails();
                        break;
                    }
                    case 0 -> {
                        System.out.println("Goodbye!");
                        break;
                    }
                    default -> {
                        System.out.println("Invalid option!");
                        break;
                    }
                    
                }

            } while (choice != 0);
        }
    }
}
