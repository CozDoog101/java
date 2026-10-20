import java.util.Arrays;

public class App4 {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 1, 9, 4, 2};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 4
        ));
    }
}
