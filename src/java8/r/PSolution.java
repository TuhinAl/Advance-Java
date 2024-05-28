package java8.r;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class PSolution {


    public static List<Integer> stringToNumberConvert(String input) {

        String[] split = input.split("/");
        List<String> list = Arrays.asList(split);

        return list
                .stream()
                .map(PSolution::stringToInteger)
                .collect(Collectors.toList());
    }
    public static List<Integer> alternateWay(String input) {

        String[] split = input.split("/");
        List<String> list = Arrays.asList(split);

        return list
                .stream()
                .filter(PSolution::isNumber)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static boolean isNumber(String input) {
        // Regular expression to match a number
        String regex = "^[-+]?\\d*\\.?\\d+$";
        // Check if the input matches the regular expression
        return input.matches(regex);
    }

    public static Integer stringToInteger(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Element "+string +" is not valid type number.");
            return null;
        }
    }

    public static String listToString(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(employee2 -> employee2.getSalary()>50000)
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .findFirst().get().getKey();
    }



    public static void main(String[] args) {
//        System.out.println(PonirSolution.stringToNumberConvert("/a/b/3"));
        System.out.println(PSolution.listToString(Arrays.asList(
                new Employee("Tuhin", "ED", 30000),
                new Employee("Noman", "SQA", 40000),
                new Employee("Tanvir", "WEB", 50000),
                new Employee("Shahriar", "ANDROID", 80000),
                new Employee("Ashik", "IOS", 35000),
                new Employee("Rana", "ERP", 38000)
        )));
    }
}


 class Employee {
    private String name;
    private String department;
    private int salary;

     public Employee(String name, String department, int salary) {
         this.name = name;
         this.department = department;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getDepartment() {
         return department;
     }

     public void setDepartment(String department) {
         this.department = department;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }
 }