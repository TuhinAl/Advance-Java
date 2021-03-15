package java8.Reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDAO {

   public static List<Employee> getAllEmployee() {
        return Stream.of(
                new Employee("Alice", "A", 30000),
                new Employee("Bob","B",25000),
                new Employee("Nelson","C",20000),
                new Employee("Jamal","A",45000)
        ).collect(Collectors.toList());
    }


}
