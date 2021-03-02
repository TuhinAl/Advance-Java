package lambdaExpression.stream;

import lambdaExpression.realObject.Employee;
import lambdaExpression.realObject.EmployeeDAO;

import java.util.*;

/**
 * @author Alauddin Tuhin
 * @created_on 2/28/21 at 7:33 AM
 * @project java practice
 **/
public class SortMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Real Madrid");
        map.put(2, "Bayern Munich");
        map.put(3, "Barcelona");
        map.put(4, "Liverpool");
        map.put(5, "Arsenal");

        List<Map.Entry<Integer, String>> mapToList = new ArrayList<>(map.entrySet());

        Collections.sort(mapToList,  ( o1, o2)-> o1.getKey().compareTo(o2.getKey()));

        // print Map by iterating
       /* for (Map.Entry<Integer,String> maps : mapToList){
            System.out.println(maps.getKey()+" "+maps.getValue());
        }*/


       /* map.entrySet().stream().sorted(
                Map.Entry.comparingByKey()
        ).filter(p->p.getKey()%2==0).forEach(System.out::println);*/

        EmployeeDAO.getEmployeeMap().entrySet().stream()
                .sorted(
                        Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())
                )
                .forEach(System.out::println);



    }


}
