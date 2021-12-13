package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Student) o1).compareTo(((Student) o2));
    }
}
