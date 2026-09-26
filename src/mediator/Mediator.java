package mediator;

import colleague.Student;
import model.Book;

public interface Mediator {

    void requestBook(Student student, Book book);

    void returnBook(Student student, Book book);
}
