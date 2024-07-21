package org.example.useraccountcredimpl;

import org.example.librarybooklendingfinecatalogimpl.Book;
import org.example.librarybooklendingfinecatalogimpl.Catalog;

public class Librarian extends Account{

    public Librarian(String id, String password, User person) {
        super(id, password, person);
    }

    public void addBook(Book book, Catalog bookDatabase){
        bookDatabase.updateBook(book);
        System.out.println("Done");
    }

    public void registerUser(){

    }

}
