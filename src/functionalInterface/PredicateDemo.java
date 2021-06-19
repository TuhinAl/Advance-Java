package functionalInterface;

import lambdaExpression.lambdaObject.Book;
import lambdaExpression.lambdaObject.BookDAO;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
/*

        Predicate<Book> books = book -> {
            if (book.getPrice() >= 390)
                return true;
            else
                return false;
        };
*/

        List<Book> getAllBook = BookDAO.getBook();
        getAllBook.stream().filter(p->p.getPrice() % 10 != 0 ? true:false).forEach(p -> System.out.println(p));

    }

    // 170<price<400
    /*@Override
    public boolean test(Book book) {
        if (book.getPrice() >= 170)
            return true;
        else
            return false;
    }*/
}
