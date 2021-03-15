package java8.Reduce;

public class Employee {

    private String name;
    private String grade;
    private Integer salary;

    public Employee(String name, String grade, Integer salary) {
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
