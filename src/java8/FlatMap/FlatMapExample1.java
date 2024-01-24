package java8.FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample1 {
    public static void main(String[] args) {
        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> developerList = new ArrayList<>();
        developerList.add(o1);
        developerList.add(o2);

        Set<String> bookSet = developerList
                .stream()
                .map(data -> data.getBook())
                .flatMap(x -> x.stream())
                .filter(x -> !x.toLowerCase().equals("python"))
                .collect(Collectors.toSet());

        bookSet.stream().forEach(e -> System.out.println(e));
    }
}
