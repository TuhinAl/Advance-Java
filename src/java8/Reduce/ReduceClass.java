package java8.Reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceClass {



    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(14, 13, 23, 21, 31, 22, 14, 17, 28);

        List<String> stringList = Arrays.asList(
                "Spring boot", "java", "hibernate", "functional programming"
        );

        int sum = 0;
        for (int number : numberList) {
            sum += number;

        }
        System.out.println(sum);

        int sumByMap = numberList.stream().mapToInt(i -> i).sum();
        System.out.println("Sum Using mapToInt: "+sumByMap);

        Integer sumByReduce = numberList.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("Sum By Reduce: " + sumByReduce);
        
        // find MAX value using method reference and reduce function

        Integer maxValueByMethodReference = numberList.stream().reduce(Integer::max).get();
        System.out.println(maxValueByMethodReference);

        Integer MAXbyReduce = numberList.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Max by Reduce: " + MAXbyReduce);

        String sortedString = stringList.stream().reduce((word1, word2) ->
                word1.length()> word2.length() ? word1 : word2).get();

        System.out.println("sortedString:  " + sortedString);

      Double avgsalary =   EmployeeDAO.getAllEmployee().stream().filter(
                p -> p.getGrade().equalsIgnoreCase("A")
        ).map(p -> p.getSalary()).mapToInt(i -> i).average().getAsDouble();

      System.out.println("average slary: " +avgsalary);

        int totalSalara = EmployeeDAO.getAllEmployee().stream().filter(p -> p.getGrade().equalsIgnoreCase("A")).map(p -> p.getSalary()).mapToInt(i -> i).sum();
        System.out.println("totalSalara: " + totalSalara);
    }



}
