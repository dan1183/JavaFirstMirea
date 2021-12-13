package ru.mirea.task27.second;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class World implements Iterable{
    private final HashMap<String, HashSet<City>> map = new HashMap<>();

    public World() {
    }

    public void addCity(City city) {
        if (!map.containsKey(city.getCountry())) {
            map.put(city.getCountry(), new HashSet<>());
        }
        var set = map.get(city.getCountry());
        set.add(city);
    }

    public Set<City> getCities(String country) {
        return map.get(country);
    }

    public boolean containsCity(City city) {
        if (!map.containsKey(city.getCountry())) {
            return false;
        }
        return map.get(city.getCountry()).contains(city);
    }

    @Override
    public Iterator iterator() {
        return map.entrySet().iterator();
    }

    @Override
    public void forEach(Consumer action) {
        map.entrySet().forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return map.entrySet().spliterator();
    }
}
