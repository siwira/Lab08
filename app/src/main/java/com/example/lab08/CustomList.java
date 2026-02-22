package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }

    // include hasCity() function
    public boolean hasCity(City city){
        return this.cities.contains(city);
    }
    // include deleteCity() function
    public void deleteCity(City city){
        this.cities.remove(city);
    }

}
