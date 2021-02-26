package OOP.polymorphism;

public class AbstractDriverClass {
    public static void main(String [] arguments){
        Employee employee = new Employee("Alauddin","Tuhin",1000);
        Person person = new Employee("Abdullah","Hridoy",1001);
        //Employee employee1 = new Person(")
        Person person1 = new Employee("Test", "User", 1002);

        System.out.println(employee);
        System.out.println(person);
        System.out.println(person1);
        System.out.println(employee.sum(10,12));
        employee.work();
        person.work();
        employee.changeName("Islam");
        person.changeName("Pagla");
        System.out.println(person.sum(15,12));
        System.out.println(person.toString());
        System.out.println(employee.toString());
        System.out.println(employee);
        System.out.println(person);
        System.out.println(person1);

    }
}
