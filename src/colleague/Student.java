package colleague;

import mediator.Mediator;
import model.Book;

public class Student {

    private final String name;
    private final Mediator mediator;

    public Student(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void requestBook(Book book) {
        System.out.println(name + " requests the book \"" + book.getTitle() + "\".");
        mediator.requestBook(this, book);
    }

    public void returnBook(Book book) {
        mediator.returnBook(this, book);
    }
}
