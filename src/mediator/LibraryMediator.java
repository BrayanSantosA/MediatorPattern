package mediator;

import colleague.Student;
import model.Book;

import java.util.HashMap;
import java.util.Map;

public class LibraryMediator implements Mediator {

    private final Map<String, Boolean> availability = new HashMap<>();

    public void registerBook(Book book) {
        availability.put(book.getTitle(), true);
    }

    @Override
    public void requestBook(Student student, Book book) {
        boolean available = availability.getOrDefault(book.getTitle(), false);

        if (available) {
            availability.put(book.getTitle(), false);
            System.out.println("Library: loan approved for " + student.getName() + ".");
        } else {
            System.out.println("Library: the book is not available.");
        }
    }

    @Override
    public void returnBook(Student student, Book book) {
        availability.put(book.getTitle(), true);
        System.out.println(student.getName() + " returns the book \"" + book.getTitle() + "\".");
        System.out.println("Library: book available again.");
    }
}
