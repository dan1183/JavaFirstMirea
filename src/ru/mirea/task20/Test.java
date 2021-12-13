package ru.mirea.task20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    private static final String formatString = "yyyy.MM.dd hh:MM";

    private static void firstTask() {
        Scanner in = new Scanner(System.in);
        String inputData = in.nextLine();
        DateFormat format = new SimpleDateFormat(formatString);
        Date date = null;
        try {
            date = format.parse(inputData);
            Calendar calendar = new GregorianCalendar(date.getYear(), date.getMonth(), date.getDay());
            System.out.println("Date: " + date);
            System.out.println("Calendar: " + calendar);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void secondTask() {
        String dateOfAssignmentString = "2022.11.19 14:59";
        Date currentDate = new Date();
        Date dateOfAssignment = null;
        DateFormat format = new SimpleDateFormat(formatString);
        try {
            dateOfAssignment = format.parse(dateOfAssignmentString);
            System.out.println("My full name: Tagirov Rodion Rinatovich");
            System.out.println("Date of assignment: " + dateOfAssignment);
            System.out.println("Assignment due date: " + currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
