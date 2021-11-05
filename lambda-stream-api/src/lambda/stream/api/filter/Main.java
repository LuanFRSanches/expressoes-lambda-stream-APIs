package lambda.stream.api.filter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Carlos", "José", "João", "Joana", "Maria", "Celso");

        words.stream()
                .filter(w -> w.startsWith("J"))
                .map(w -> w.toLowerCase())
                .forEach(w -> System.out.println(w));
        // .collect(Collectors.toList());

        //filteredWords.forEach(w -> System.out.println(w));

    }
}
