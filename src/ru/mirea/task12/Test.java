package ru.mirea.task12;

public class Test {
    public static void main(String[] args) {
        Students task = new Students(10);
        for (var item :
                task) {
            System.out.println(item);
        }

        task.mergeSort();

        for (var item :
                task) {
            System.out.println(item);
        }
    }
}
