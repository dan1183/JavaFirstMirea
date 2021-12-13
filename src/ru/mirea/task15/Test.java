package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        int numberOfTasks = in.nextInt();

        switch (numberOfTasks) {
            case 1, 3 -> {
                writeToFile(path, false);
            }
            case 2 -> {
                readFromFile(path);
            }
            case 4 -> {
                writeToFile(path, true);
            }
        }
    }

    public static void writeToFile(String path, boolean append) {
        try (FileWriter writer = new FileWriter(path, append)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the text:");
            String input = br.readLine();
            writer.write(input);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void readFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
