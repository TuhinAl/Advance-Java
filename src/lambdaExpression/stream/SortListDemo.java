package lambdaExpression.stream;


import lambdaExpression.realObject.Employee;
import lambdaExpression.realObject.EmployeeDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 5:32 PM
 * @project java practice
 **/
public class SortListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(4);
        integerList.add(12);
        integerList.add(7);
        integerList.add(9);
        integerList.add(14);
        integerList.add(5);

        List<Employee> employees = new ArrayList<>();
        employees = EmployeeDAO.getEmployee();

        Collections.sort(employees,(o1, o2)-> (o1.getSalary()- o2.getSalary()));
        //System.out.println(employees);

    employees.stream().sorted(
            (o1, o2)-> (o1.getSalary()- o2.getSalary())
    ).forEach(System.out::println);

        System.out.println("************////*****");
        employees.stream().sorted(Comparator.comparing(p->p.getName()))
                .forEach(System.out::println);
        System.out.println("****************");
        employees.stream().sorted(
                Comparator.comparing(Employee::getName)
        ).forEach(System.out::println);


       /* integerList.stream().
                sorted(Collections.reverseOrder())
                .forEach(t -> System.out.println(t));
        System.out.println();
        integerList.stream().forEach(t -> System.out.println(t));*/

    }


}
