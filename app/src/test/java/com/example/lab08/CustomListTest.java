package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
        list.deleteCity(calgary); // this will fail
        assertFalse(list.hasCity(calgary));
    }
    @Test
    public void testCountCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(1, list.countCity());
        City montreal = new City("Montreal", "QC");
        list.addCity(montreal);
        assertEquals(2, list.countCity());
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertEquals(3, list.countCity());
        list.deleteCity(montreal);
        assertEquals(2, list.countCity());
    }
}
