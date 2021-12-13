package ru.mirea.task3;

import java.util.Date;

public final class Book {
    private String author;
    private String name;
    private String publisher;
    private int editionNumber;
    private Date dateOfPublish;


    public Book(String author, String name, String publisher, int editionNumber, Date dateOfPublish) {
        if(editionNumber < 0) {
            throw new IllegalArgumentException("Edition number cannot be negative");
        }
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.editionNumber = editionNumber;
        this.dateOfPublish = (Date) dateOfPublish.clone();
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public Date getDateOfPublish() {
        return dateOfPublish;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEditionNumber(int editionNumber) {
        if(editionNumber < 0) {
            throw new IllegalArgumentException("Edition number cannot be negative");
        }
        this.editionNumber = editionNumber;
    }

    public void setDateOfPublish(Date dateOfPublish) {
        this.dateOfPublish = (Date) dateOfPublish.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", edition_number=" + editionNumber +
                ", date_of_publish=" + dateOfPublish +
                '}';
    }
}
