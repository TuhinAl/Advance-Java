package lambdaExpression;

import lambdaExpression.lambdaObject.Book;
import lambdaExpression.lambdaObject.BookDAO;

import java.util.Comparator;
import java.util.List;

public class ForEachClass {



    public static void main(String[] args) {
        List<Book> listOfBook = BookDAO.getBook();
        //listOfBook.stream().sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p));
    }
}
