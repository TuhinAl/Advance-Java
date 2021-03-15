package java8.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerFlatMap {

   public static List<Customer> getAllCustomer(){
        return Stream.of(
                new Customer(10, "John doe", "john@gmail.com", Arrays.asList(
                        "0234743", "2378394907", "9823423984"
                )),
                new Customer(20, "Alice", "alice@gmail.com", Arrays.asList(
                        "327567823", "782347832"
                )),
                new Customer(30, "Bob", "bob@yahoo.com", Arrays.asList(
                        "9823648932", "8723467832", "87236478"
                )),
                new Customer(40, "Nelson", "nelson@yahoo.com", Arrays.asList(
                        "9842369", "98324786"
                ))
        ).collect(Collectors.toList());

    }
}
