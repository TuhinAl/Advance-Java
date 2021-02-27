package lambdaExpression.lambdaObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 6:59 AM
 * @project java practice
 **/
public class BookDAO {

    public List<Book> getBook(){

        List<Book> listOfBook = new ArrayList<>();
        listOfBook.add(new Book("Java 8 in Action", "Mario Fusco", "250"));
        listOfBook.add(new Book("Hibernate","Alan Mycroft","300"));
        listOfBook.add(new Book("Effective Java", "Jashua Blosh", "245"));
        listOfBook.add(new Book("Database", "Roax", "350"));
        return listOfBook;
    }

}
