package java8.stream;

import java.util.function.Predicate;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 7:53 AM
 * @project java practice
 **/
public class PredicateDemo {



    public static void main(String[] args) {
        Predicate<Integer> predicate = t->t %2 == 0;
        PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicate.test(5));
    }
}
