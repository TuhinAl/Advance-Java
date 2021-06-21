package methodReference;

public interface B {
     void add(int a, int b);
}
 interface C {
     Employee getEmployee();
}
 interface D {
     Employee getEmployee(String name, int age);
}
class Employee{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee() {

    }

    public void getInfo() {
        System.out.println(" I am a Method of class Employee");

    }
}
class Addition{
    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        //lambda expression
        B b = (p, q) -> System.out.println(p + q);
        b.add(10, 15);

        //method reference
        Addition addition = new Addition();
        B b2 = addition::sum;
        b2.add(15, 13);


        //lambda expression
        C c = () -> new Employee();
        c.getEmployee().getInfo();

        D d = (name, age) -> new Employee(name, age);
        d.getEmployee("ALice Bob", 33).getInfo();


        //method reference

        C c1 = Employee::new;
        D d1 = Employee::new;

    }
}
