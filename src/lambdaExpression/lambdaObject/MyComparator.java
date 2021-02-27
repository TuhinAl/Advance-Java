package lambdaExpression.lambdaObject;

import java.util.Comparator;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 7:12 AM
 * @project java practice
 **/
public class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getPrice().compareTo(o1.getPrice());
    }
}
