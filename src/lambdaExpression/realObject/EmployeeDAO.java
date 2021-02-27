package lambdaExpression.realObject;

import java.util.ArrayList;
import java.util.List;

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

}
