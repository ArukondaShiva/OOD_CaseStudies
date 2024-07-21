package org.example.librarybooklendingfinecatalogimpl;

public class Book {

    private String title;
    private String subject;
    private String author;
    private String publisher;
    private int id;
    private int count = 1;


    public Book(String title, String subject, String author, String publisher) {
        this.title = title;
        this.subject = subject;
        this.author = author;
        this.publisher = publisher;
        this.id = id;
        this.count++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}