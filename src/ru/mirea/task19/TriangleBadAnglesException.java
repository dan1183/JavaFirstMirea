package ru.mirea.task19;

public class TriangleBadAnglesException extends Exception {
    private String message;

    public TriangleBadAnglesException() {
        super();
        this.message = "";
    }

    public TriangleBadAnglesException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String toString() {
        return "TriangleBadAnglesException " + message;
    }
}
