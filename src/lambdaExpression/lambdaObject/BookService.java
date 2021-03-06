package lambdaExpression.lambdaObject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 7:05 AM
 * @project java practice
 **/
public class BookService {

    static List<Book> getBookInSort(){
        List<Book> list = new BookDAO().getBook();
        Collections.sort(list, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookInSort());
    }

}
