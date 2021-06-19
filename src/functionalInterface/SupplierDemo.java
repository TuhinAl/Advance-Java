package functionalInterface;

import lambdaExpression.lambdaObject.Book;
import lambdaExpression.lambdaObject.BookDAO;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {



    public static void main(String[] args) {
        List<Book> bookList = BookDAO.getBook();

         Supplier<Book> supplier = () -> bookList.get(0);

        Book book = bookList.stream().findAny().orElseGet(() -> bookList.get(0));

        System.out.println("Book: " + book);
    }
}
