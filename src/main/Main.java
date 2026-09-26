package main;

import colleague.Student;
import mediator.LibraryMediator;
import model.Book;

public class Main {

    public static void main(String[] args) {
        LibraryMediator mediator = new LibraryMediator();

        Book book = new Book("Design Patterns");
        mediator.registerBook(book);

        Student ana = new Student("Ana", mediator);
        Student carlos = new Student("Carlos", mediator);

        ana.requestBook(book);
        carlos.requestBook(book);
        ana.returnBook(book);
        carlos.requestBook(book);
    }
}
