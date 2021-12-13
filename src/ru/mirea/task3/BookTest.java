package ru.mirea.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        BookTest bookTest = new BookTest();
        try {
            Book book = bookTest.createBook();
            System.out.println(book);
        } catch (IllegalArgumentException | ParseException ex) {
            System.out.println(ex);
        }
    }

    private Book createBook() throws IllegalArgumentException, ParseException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter book author:");
        String author = in.nextLine();
        System.out.println("Enter book name:");
        String name = in.nextLine();
        System.out.println("Enter book publisher:");
        String publisher = in.nextLine();
        System.out.println("Enter book edition number:");
        int editionNumber = in.nextInt();
        in.nextLine();
        System.out.println("Enter book date of publish:");
        String strDate = in.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfPublish = dateFormat.parse(strDate);
        in.close();
        return new Book(author, name, publisher, editionNumber, dateOfPublish);
    }
}
