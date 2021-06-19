package functionalInterface;
import lambdaExpression.lambdaObject.Book;
import lambdaExpression.lambdaObject.BookDAO;
import java.util.List;


public class ConsumerDemo  {


    public static void main(String[] args) {
        System.out.println(ConsumerDriverClass.getAllSortedBook());
        List<Book> allBook = ConsumerDriverClass.getAllSortedBook();
        /*Collections.sort(allBook, (o1, o2) -> o1.getName().compareTo(o2.getName()));


        List<Book> bookList = BookDAO.getBook();
        Book firstBook = bookList.get(0);

        Consumer<Book> consumer = book ->  System.out.println("First Book: " +book);*/

        allBook.stream().forEach(book ->  System.out.println("First Book: " +book));


        }




}

class ConsumerDriverClass {

    public static List<Book> getAllSortedBook() {
        List<Book> bookList = BookDAO.getBook();
        return bookList;
    }



}
