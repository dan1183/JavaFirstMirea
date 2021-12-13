package ru.mirea.task4;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        TestAuthor test = new TestAuthor();
        Author author = test.createAuthor();
        System.out.println(author);
    }

    private Author createAuthor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter author name:");
        String name = in.nextLine();
        System.out.println("Enter author email:");
        String email = in.nextLine();
        System.out.println("Enter author gender:");
        char gender = in.nextLine().charAt(0);

        return new Author(name, email, gender);
    }
}
