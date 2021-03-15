package java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 7:46 AM
 * @project java practice
 **/
public class ConsumerDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,7,4,9,11,15,13);

        list.stream().forEach(
                p-> System.out.println(p)
        );
    }

}
