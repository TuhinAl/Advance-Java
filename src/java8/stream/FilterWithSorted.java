package java8.stream;

import data.CustomData;
import data.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterWithSorted {

    public static void main(String[] args) {
        List<Student> studentList = CustomData.getData();
        List<Student> collected = studentList
                .stream()
                .filter(student -> student.getCgpa() > 3.90)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

//        collected.stream().forEach(student -> System.out.println(student.getName()));
        List<String> duplicateCustomerList = new ArrayList<>(studentList
                .stream()
                .map(Student::getName)
                .collect(Collectors.groupingBy(student -> student, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() >= 3)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue)).keySet());

        List<String> collect2 = studentList
                .stream()
                .map(Student::getName)
                .collect(Collectors.groupingBy(student -> student, Collectors.counting()))
                .keySet().stream().collect(Collectors.toList());


        duplicateCustomerList.stream().forEach(System.out::println);
    }
}
