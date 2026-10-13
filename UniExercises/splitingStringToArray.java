import java.util.Scanner;
public class splitingStringToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 strings separated by spaces: ");
        String input = scanner.nextLine();

        String[] arrOfWords = input.trim().split(" ");

        if (arrOfWords.length != 5) {
            System.out.println("Enter exactly 5 strings!");
        } else {
            for (String s : arrOfWords) {
                System.out.println(s);
            }
        }

        scanner.close();
    }
}

