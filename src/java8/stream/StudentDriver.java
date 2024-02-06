package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDriver {

   public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        Student tuhin = new Student("Alauddin Tuhin", 22, "Male", "CSE");
        Student tanvir = new Student("Tanvir Hasnan", 27, "Male", "EEE");
        Student noman = new Student("Abdullah Al Noman", 23, "Male", "EEE");
        Student shahriar = new Student("Abdullah Al Noman", 29, "Male", "CSE");
        Student afrin = new Student("Abdullah Al Noman", 31, "Female", "BBA");
        studentList = Arrays.asList(tuhin, tanvir, noman, shahriar, afrin);
        return studentList;
    }
    public static void main(String[] args) {
        List<Student> studentList = getStudentList();
    /*    studentList
                .stream()
                .filter(student -> student.getAge() > 25)
                .map(Student::getDepartment)
                .forEach(System.out::println);*/


        Map<String, Long> collect = studentList
                .stream()
                .filter(student -> student.getAge() > 25)
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));

    }
}
