public class App7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 2, 4};
        System.out.println("Occurences of 2: " + countOccurences(numbers, 2));
        System.out.println("Occurences of 7: " + countOccurences(numbers, 7));
    }

    public static int countOccurences(int[] numbers, int n) {
        int count = 0;
        for (int number : numbers) {
            if (number == n) {
                count++;
            }
        }
        return count;
    }
}
