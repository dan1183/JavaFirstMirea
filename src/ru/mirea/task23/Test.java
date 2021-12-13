package ru.mirea.task23;

public class Test {
    public static void main(String[] args) {
        Object[] objects = new Object[]{1, 2, "asdasd", ' ', '\t', "qwe"};
        PrintHashCodes(objects);
        CompareHashCodes(objects);
    }

    private static void CompareHashCodes(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects.length; j++) {
                if (i == j) {
                    continue;
                }
                if (objects[i].hashCode() == objects[j].hashCode()) {
                    System.out.println("Hash code of (" + objects[i].toString() + ") and hash code of (" + objects[j].toString() + ") are equals");
                } else {
                    System.out.println("Hash code of (" + objects[i].toString() + ") and hash code of (" + objects[j].toString() + ") are not equals");
                }
            }
        }
    }

    private static void PrintHashCodes(Object[] objects) {
        for (var item : objects) {
            System.out.println("Hash code of (" + item.toString() + ") = " + item.hashCode());
        }
    }
}
