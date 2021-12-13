package ru.mirea.task18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Shop {
    private final HashMap<String, User> users;

    public Shop() {
        this.users = new HashMap<>();
    }

    public void add(User user) {
        if (users.containsKey(user.getInn())) {
            throw new IllegalArgumentException("User with this inn number already contains!");
        }
        users.put(user.getInn(), user);
    }

    public void remove(String inn) {
        if (inn.length() != 10) {
            throw new IllegalArgumentException("Non correct inn number");
        }
        if (!users.containsKey(inn)) {
            throw new IllegalArgumentException("User with this inn is not contains!");
        }
        users.remove(inn);
    }

    public User get(String inn) {
        if (inn.length() != 10) {
            throw new IllegalArgumentException("Non correct inn number");
        }
        if (!users.containsKey(inn)) {
            throw new IllegalArgumentException("User with this inn is not contains!");
        }
        return users.get(inn);
    }

    Collection<User> values() {
        return users.values();
    }
}
