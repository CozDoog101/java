package Su4.countPassingStudents;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(2, 5, 3, 6, 2, 4, 5, 2);

        long result = grades.stream()
                .filter(grade -> grade >= 3)
                .count();

        System.out.println(result);
    }
}
