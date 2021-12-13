package ru.mirea.task18;

public final class User {
    private final String inn;
    private final String surname;
    private final String name;
    private final String patronymic;

    User(String inn, String surname, String name, String patronymic) {
        if (inn.length() != 10) {
            throw new IllegalArgumentException("Non correct inn number");
        }
        this.inn = inn;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    User(String inn, String fullName) {
        if (inn.length() != 10) {
            throw new IllegalArgumentException("Non correct inn number");
        }
        this.inn = inn;
        String[] args = fullName.split(" ");
        if (args.length != 3) {
            throw new IllegalArgumentException("Invalid full name of user");
        }
        this.surname = args[0];
        this.name = args[1];
        this.patronymic = args[2];
    }

    public String getInn() {
        return inn;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }
}
