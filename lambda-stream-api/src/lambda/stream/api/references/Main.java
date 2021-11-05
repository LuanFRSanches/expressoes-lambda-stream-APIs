package lambda.stream.api.references;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Carlos", "José", "João", "Joana", "Maria", "Celso");

        List<String> filteredWords = words.stream()
                .filter(w -> w.startsWith("J"))
                //.map(w -> w.toLowerCase())
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        //filteredWords.forEach(w -> System.out.println(w));
        filteredWords.forEach(System.out::println);
    }
}
