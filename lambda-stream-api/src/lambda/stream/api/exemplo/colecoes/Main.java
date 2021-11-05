package lambda.stream.api.exemplo.colecoes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("BMW", 120000), new Car("Renault", 85000), new Car("VW", 70000));

        cars.stream().
                sorted((c1, c2) -> Double.valueOf(c1.getPrince()).compareTo(c2.getPrince()))
                .map(c -> new Car(c.getBrand().toLowerCase(), c.getPrince()))
                .peek(Car::addTax)
                .forEach(System.out::println);
    }
}
