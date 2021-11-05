package lambda.stream.api;

import java.util.ArrayList;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 4, 1, 2));


       /*
       *  Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return -o1.compareTo(o2);
            }
        };
       * */
        numbers.sort((o1, o2) -> -o1.compareTo(o2));
        System.out.println(numbers);
    }
}