package lambdaExpression.realObject;

import java.util.*;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 3:32 PM
 * @project java practice
 **/
public class EmployeeDAO {

    public static List<Employee> getEmployee(){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Hashmi Kama", "Web Service", 53000));
        employeeList.add(new Employee("Rakib Hasan", "REST API Lead", 45000));
        employeeList.add(new Employee("Manik Anam", "Database Designer", 35000));
        employeeList.add(new Employee("Samiul Islam", "Web Architect", 70000));

        return employeeList;
    }

    public static Map<Employee,Integer> getEmployeeMap(){

        Map<Employee, Integer> employees = new TreeMap<>((o1, o2)->o1.getSalary() - o2.getSalary());

        employees.put(new Employee("Hashmi Kama", "Web Service", 53000),60);
        employees.put(new Employee("Rakib Hasan", "REST API Lead", 45000),50);
        employees.put(new Employee("Manik Anam", "Database Designer", 35000),90);
        employees.put(new Employee("Samiul Islam", "Web Architect", 70000),40);

        return employees;
    }

}
