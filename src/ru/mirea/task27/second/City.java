package ru.mirea.task27.second;

import java.util.Objects;

public final class City {
    private final String city;
    private final String Country;

    public City(String city, String country) {
        this.city = city;
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return Country;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(Country, city1.Country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, Country);
    }
}
