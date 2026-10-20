import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
        
        System.out.println("arr1 == arr2: " + (arr1 == arr2));
    }
}
