package lambdaExpression.lambdaObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 6:59 AM
 * @project java practice
 **/
public class BookDAO {

    public static List<Book> getBook(){

        List<Book> listOfBook = new ArrayList<>();
        listOfBook.add(new Book("Java 8 in Action", "Mario Fusco", 250));
        listOfBook.add(new Book("Hibernate","Alan Mycroft",300));
        listOfBook.add(new Book("Effective Java", "Jashua Blosh", 245));
        listOfBook.add(new Book("Database", "Roax", 350));
        listOfBook.add(new Book("Eloquent JS", "Alice Bob", 520));
        listOfBook.add(new Book("Full stack with VueJS", "John Doe", 430));
        listOfBook.add(new Book("Head first Python", "Alisa Smith", 120));
        listOfBook.add(new Book("PostgreSql", "Fatima", 280));
        listOfBook.add(new Book("Microservice with Spring Boot", "Jack Jones", 185));
        return listOfBook;
    }

}
