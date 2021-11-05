package lambda.stream.api.concatenacao.string;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "ACBA";

        str.chars()
                .map(i -> i - 64)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-","=>>","<<="));
    }
}
