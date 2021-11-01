package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(listSize + 1, list.getCount());
    }
    /*
    @Test
    void testHasCity(){

        City city = new City("Calgary", "Alberta");
        assertFalse(list.getCities().contains(city));// doesn't contain city Calgary
        list.addCity(city);
        assertTrue(list.getCities().contains(city));// now city should contain city Calgary
    }

     */
    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        assertEquals(listSize + 1, list.getCount());
        list.deleteCity(city);
        assertEquals(listSize + 0, list.getCount());

    }
    @Test
    void countCitiesTest(){
        int listSize = list.getCount();
        City city1 = new City("Toronto", "Ontario");
        City city2 = new City("Vancouver", "British Columbia");

        assertEquals(listSize + 0,list.getCount());
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(listSize + 2,list.getCount());
        list.deleteCity(city2);
        assertEquals(listSize + 1,list.getCount());
    }
}
