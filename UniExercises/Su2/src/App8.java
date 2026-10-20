import java.util.Arrays;

public class App8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 1, 4, 3, 5};
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }

    public static int[] removeDuplicates(int[] numbers) {
        //to be implemented
        return Arrays.stream(numbers).distinct().toArray();
    }
}