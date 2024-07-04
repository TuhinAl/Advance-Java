package reflection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectMapperDrawbackTest {

}

class Student {
    int name;
    int roll;
    List<Book> bookList;

    public Student(int name, int roll, List<Book> bookList) {
        this.name = name;
        this.roll = roll;
        this.bookList = bookList;
    }

    public int getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public List<Book> getBookList() {
        return bookList;
    }


    public static void main(String[] args) {


        Chapter chapter1 = new Chapter("chapter-1");
        Chapter chapter2 = new Chapter("chapter-2");
        Chapter chapter3 = new Chapter("chapter-3");
        Chapter chapter4 = new Chapter("chapter-4");
        Chapter chapter5 = new Chapter("chapter-5");
        Chapter chapter6 = new Chapter("chapter-6");
        Chapter chapter7 = new Chapter("chapter-7");
        Chapter chapter8 = new Chapter("chapter-8");
        Chapter chapter9 = new Chapter("chapter-9");
        Chapter chapter10 = new Chapter("chapter-10");
        Chapter chapter11 = new Chapter("chapter-11");
        Chapter chapter12 = new Chapter("chapter-12");

        Book book1 = new Book("Bangla", "sbn1", Arrays.asList(chapter1, chapter2));
        Book book2 = new Book("English", "sbn1", Arrays.asList(chapter3, chapter4));
        Book book3 = new Book("Math", "sbn1", Arrays.asList(chapter5, chapter6));
        Book book4 = new Book("Biology", "sbn1", Arrays.asList(chapter7, chapter8));
        Book book5 = new Book("Science", "sbn1", Arrays.asList(chapter9, chapter10));
        Book book6 = new Book("Social", "sbn1", Arrays.asList(chapter11, chapter12));


        List<Book> list = Arrays.asList(book1, book2, book3, book4, book5, book6);

        List<BookDto> collect = list.stream().map(book -> {
                    BookDto bookDto = new BookDto(book.getBookName(), book.getChapterList());

                    return bookDto;
                })
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
class Book{
    String bookName;
    String sbnNo;
    List<Chapter> chapterList;

    public Book(String bookName, String sbnNo, List<Chapter> chapterList) {
        this.bookName = bookName;
        this.sbnNo = sbnNo;
        this.chapterList = chapterList;
    }

    public String getBookName() {
        return bookName;
    }

    public String getSbnNo() {
        return sbnNo;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }
}
class Chapter{
    String chapterName;

    public Chapter(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterName() {
        return chapterName;
    }
}

class BookDto {
    String bookName;
    List<Chapter> chapterList;

    public BookDto(String bookName, List<Chapter> chapterList) {
        this.bookName = bookName;
        this.chapterList = chapterList;
    }

    public String getBookName() {
        return bookName;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }
}