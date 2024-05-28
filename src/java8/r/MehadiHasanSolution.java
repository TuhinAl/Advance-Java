package java8.r;

import java.util.*;
import java.util.stream.Collectors;

public class MehadiHasanSolution {

    public static List<String> getGrades(List<Student> studentList) {
        List<String> stringList = studentList
                .stream()
                .filter(student -> student.getGrade().isPresent())
                .map(s -> s.getGrade().get().getGradeValue())
                .collect(Collectors.groupingBy(grade -> grade,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(gradeCount -> gradeCount.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return stringList;
    }

    public static  Map<String, Long> findMaxGrade(List<Student> studentList) {

        Map<String, Long> collect = studentList
                .stream()
                .filter(student -> student.getGrade().isPresent())
                .map(s -> s.getGrade().get().getGradeValue())
                .collect(Collectors.groupingBy(grade -> grade,
                        Collectors.counting()));


        return collect;
    }

    public static String maxCount(Map<String, Long> studentMap) {

        long asLong = studentMap.entrySet()
                .stream()
                .map(c -> c.getValue())
                .mapToLong(Long::longValue)
                .max()
                .getAsLong();


        return String.valueOf(asLong);
    }


    List<Student> groupByAge(List<Student> studentDataPreparation) {
        return new ArrayList<>();
    }

    List<Student> listOfGrade(List<Student> studentDataPreparation) {
        return new ArrayList<>();
    }

    List<Student> groupByGrade(List<Student> studentDataPreparation) {
        return new ArrayList<>();
    }

    List<Student> findStudentAbodeGrade(List<Student> studentDataPreparation) {
        return new ArrayList<>();
    }

    List<Student> gradeWithCount(List<Student> studentDataPreparation) {
        return new ArrayList<>();
    }


    public static void main(String[] args) {
        System.out.println(MehadiHasanSolution.getGrades(Student.getStudentList()));
        System.out.println(MehadiHasanSolution.findMaxGrade(Student.getStudentList()));
        System.out.println(MehadiHasanSolution.maxCount(MehadiHasanSolution.findMaxGrade(Student.getStudentList())));
    }
}


class Student{
    private  String name;
    private Optional<Grade> grade;

    public Student(String name, Optional<Grade> grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Grade> getGrade() {
        return grade;
    }

    public void setGrade(Optional<Grade> grade) {
        this.grade = grade;
    }

    public static List<Student> getStudentList() {
        Student monir = new Student("Moniruzzaman Juwel", Optional.ofNullable(null));
        Student sakib = new Student("Fahim Sakib", Optional.ofNullable(new Grade("A")));
        Student atik = new Student("Atiqur Rahman", Optional.ofNullable(new Grade("F")));
        Student tamim = new Student("Tamim", Optional.ofNullable(new Grade("B")));
        Student mahadi = new Student("Mahadi Hasan", Optional.ofNullable(new Grade("C")));
        Student humayun = new Student("Humayun Kabir", Optional.ofNullable(new Grade("A")));
        Student faria = new Student("Faria Sultana", Optional.ofNullable(new Grade("A")));
        Student nishat = new Student("Nishat Sultana", Optional.ofNullable(new Grade("A")));

        return Arrays.asList(monir, sakib, atik, tamim, mahadi, humayun, faria, nishat);
    }
}

class Grade{
    private  String gradeValue;

    public Grade(String gradeValue) {
        this.gradeValue = gradeValue;
    }

    public String getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(String gradeValue) {
        this.gradeValue = gradeValue;
    }
}
