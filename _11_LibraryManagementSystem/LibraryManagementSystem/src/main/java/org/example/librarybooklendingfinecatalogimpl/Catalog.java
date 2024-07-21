package org.example.librarybooklendingfinecatalogimpl;

import org.example.LibraryManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class Catalog {

    private HashMap<String, ArrayList<Book>> bookTitles = new HashMap<String,ArrayList<Book>>();
    private HashMap<String, ArrayList<Book>> bookAuthors = new HashMap<String, ArrayList<Book>>();
    private HashMap<String, ArrayList<Book>> bookSubjects = new HashMap<String, ArrayList<Book>>();
    private HashMap<String, ArrayList<Book>> bookPublications = new HashMap<String, ArrayList<Book>>();


    public void updateBook(Book book){

        // LibraryManagement.displayBook(book);

        // AUTHORS
        if(bookAuthors.containsKey(book.getAuthor())){
            bookAuthors.get(book.getAuthor()).add(book);
        }else{
            bookAuthors.put(book.getAuthor(), new ArrayList<Book>());
        }

        // TITLES
        if(bookTitles.containsKey(book.getTitle())){
            bookTitles.get(book.getTitle()).add(book);
        }
        else{
            bookTitles.put(book.getTitle(),new ArrayList<Book>());
        }

        // Publication
        if(bookPublications.containsKey(book.getPublisher())){
            bookPublications.get(book.getPublisher()).add(book);
        }else{
            bookPublications.put(book.getPublisher(),new ArrayList<Book>());
        }


        // SUBJECTS
        if(bookSubjects.containsKey(book.getSubject())){
            bookSubjects.get(book.getSubject()).add(book);
        }else{
            bookSubjects.put(book.getSubject(), new ArrayList<Book>());
        }



    }

    public ArrayList<Book> getBookByTitle(String title){
        return bookTitles.get(title);
    }

    public ArrayList<Book> getBookByAuthor(String author){
        return bookAuthors.get(author);
    }

    public ArrayList<Book> getBooksByPublisher(String publisher){
        return bookPublications.get(publisher);
    }

    public ArrayList<Book> getBooksBySubject(String subject){
        return bookSubjects.get(subject);
    }

}
