package methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArbitraryClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 33, 59, 24, 40, 2, 19, 25,60);
        //

        // anonymous inner class
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        numbers.forEach(System.out::println);

        //lambda expression
        Collections.sort(numbers, (a, b) -> a.compareTo(b));
        numbers.forEach(System.out::println);

        //method reference
        Collections.sort(numbers, Integer::compareTo);
        numbers.forEach(System.out::println);

    }
}
