
public class App2 {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Array after multiplication: " + java.util.Arrays.toString(multiply(numbers, 2)));   
    }

    public static int[] multiply(int[] numbers, int factor){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] *= factor;
        }
        return numbers;
    }
}
