package data;

public class Student {
    private Integer id;
    private String name;
    private Double cgpa;
    private Integer age;
    private String gender;
    private Integer honors;

    public Student(Integer id, String name, Double cgpa, Integer age,
                   String gender, Integer honors) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.age = age;
        this.gender = gender;
        this.honors = honors;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCgpa() {
        return cgpa;
    }
    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getHonors() {
        return honors;
    }
    public void setHonors(Integer honors) {
        this.honors = honors;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", age=" + age + ", gender=" + gender
                + ", honors=" + honors + "]";
    }
}
