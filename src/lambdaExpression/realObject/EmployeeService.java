package lambdaExpression.realObject;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 3:50 PM
 * @project java practice
 **/
public class EmployeeService {

   public static List<Employee> evaluateBySalary(){
       return EmployeeDAO.getEmployee().stream()
                .filter(emp -> emp.getSalary()>44999)
               .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(EmployeeService.evaluateBySalary());
        System.out.println();
    }

}
