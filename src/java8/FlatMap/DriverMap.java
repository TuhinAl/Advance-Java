package java8.FlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class DriverMap {
    public static void main(String[] args) {
        List<Customer> customers = CustomerFlatMap.getAllCustomer();
        List<String> email = customers.stream().map(customer ->
                customer.getEmail()).collect(Collectors.toList());
        System.out.println(email);

        //map
        List<List<String>> phone = customers.stream().map(p -> p.getPhoneNumber()).collect(Collectors.toList());

        System.out.println(phone);

        //flatMap
        List<String> phones = customers.stream().flatMap(p -> p.getPhoneNumber()
                .stream()).collect(Collectors.toList());
        System.out.println(phones);
    }
}
