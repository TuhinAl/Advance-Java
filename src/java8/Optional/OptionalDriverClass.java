package java8.Optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDriverClass {

    /*public static List<Customer> getAllCustomer(String email) {

        List<java8.FlatMap.Customer> customers = CustomerFlatMap.getAllCustomer();

        return customers.stream().filter(p -> p.getEmail().equals(email)).findAny().orElseThrow(
                () -> new IllegalArgumentException("invalid Email")
        );
    }*/

    public static void main(String[] args) {
        Customer customer = new Customer(10, "Nelson Jamal", null, Arrays.asList(
                "9034589245", "89364589"
        ));

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

      //  Optional<Object> ofOptional = Optional.of(customer.getEmail());
      //  System.out.println(ofOptional);

        Optional<String> nullable = Optional.ofNullable(customer.getEmail());

        System.out.println(nullable.orElse("didnt get any email"));
        /*System.out.println(nullable.orElseThrow(()
                -> new IllegalArgumentException("NUll value Received")));*/

        System.out.println(nullable);


    }
}
