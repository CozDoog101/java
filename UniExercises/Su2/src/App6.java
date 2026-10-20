
public class App6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("Reversed array: " + java.util.Arrays.toString(numbers));
    }

    public static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
}
