package Su4.filterSortNames;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Peter", "Anna", "Ivan",
                "Alexander", "Maria", "Andrew"
        );

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted((name1, name2) -> name1.compareTo(name2))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
