package org.example;

import org.example.librarybooklendingfinecatalogimpl.Book;
import org.example.librarybooklendingfinecatalogimpl.Catalog;
import org.example.librarybooklendingfinecatalogimpl.Library;
import org.example.useraccountcredimpl.Librarian;
import org.example.useraccountcredimpl.User;

import java.util.ArrayList;

public class LibraryManagement {

    public static void main(String[] args) {

        Library lib = new Library("test","Hyderabad");
        Catalog bookDatabase = new Catalog();

        // Create Librarian Profile
        User person = new User("Pavan","Adilabad","pavan@gmail.com","1234567890");
        Librarian librarian = new Librarian("id01","password01",person);

        Book book1 = new Book("Java","Coding","Smith","Oreilly");
        Book book2 = new Book("C++","Coding","Kant","Oreilly");

        librarian.addBook(book1,bookDatabase);
        librarian.addBook(book2,bookDatabase);

        ArrayList<Book> display = bookDatabase.getBooksBySubject("Coding");

        for(Book book : display){
            displayBook(book);
            System.out.println();
        }

    }

    public static void displayBook(Book book) {
        System.out.println("Book:");
        System.out.println("\tTitle:" + book.getTitle());
        System.out.println("\tSubject:" + book.getSubject());
        System.out.println("\tAuthor:" + book.getAuthor());
        System.out.println("\tPublisher:" + book.getPublisher());
    }

}