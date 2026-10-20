public class App5 {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 1, 9, 4, 2, 9};
        System.out.println("Index of 9: " + linearSearch(numbers, 9));
        System.out.println("Index of 7: " + linearSearch(numbers, 7));
    }

    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
