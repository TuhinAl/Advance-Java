package OOP.polymorphism;

public class Employee extends Person{

    int employeeId;



    public Employee(String firstName, String lastName, int id){
        employeeId = id;
    }

    @Override
    public void work() {
        if (employeeId == 0) System.out.println("No Employee Exist");
        else System.out.println("Employee Exist");
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }


}
