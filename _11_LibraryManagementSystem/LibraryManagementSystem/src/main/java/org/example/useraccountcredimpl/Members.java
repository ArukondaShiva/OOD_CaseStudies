package org.example.useraccountcredimpl;


import org.example.librarybooklendingfinecatalogimpl.Book;
import org.example.librarybooklendingfinecatalogimpl.BookLending;

import java.time.LocalDateTime;

public class Members extends Account{

    private int totalBooks = 0;

    public Members(String id, String password, User person) {
        super(id, password, person);
    }

    public void issueBook(Book book){
        this.totalBooks++;
    }

    public void renew(LocalDateTime today){
        BookLending.creationDate = today;
        BookLending.dueDate = today;
    }

    public int getTotalBooks(){
        return totalBooks;
    }

}