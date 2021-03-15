package java8.stream;

import java.util.function.Supplier;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 10:10 AM
 * @project java practice
 **/
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Hi";
        supplier.get();
    }

}
