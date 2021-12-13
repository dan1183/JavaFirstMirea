package ru.mirea.task12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

public class Students implements Iterable {
    private final Student[] students;

    public Students(int numberOfStudents) {
        students = new Student[numberOfStudents];
        randomFill();
    }

    public void sort() {
        for (int left = 0; left < students.length; left++) {
            Student value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.compareTo(students[i]) < 0) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
    }

    public void qSort() {
        Arrays.sort(students, new SortingStudentsByGPA());
    }

    public void mergeSort() {
        mergeSort(students, students.length);
    }

    private void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    private void randomFill() {
        for (int i = 0; i < students.length; i++) {
            students[i] = randomStudent();
        }
    }

    private Student randomStudent() {
        int id = ThreadLocalRandom.current().nextInt(1, 100);
        int grade = ThreadLocalRandom.current().nextInt(1, 100);
        return new Student(id, grade);
    }

    @Override
    public Iterator iterator() {
        return Arrays.stream(students).iterator();
    }

    @Override
    public void forEach(Consumer action) {
        Arrays.stream(students).forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Arrays.stream(students).spliterator();
    }
}
