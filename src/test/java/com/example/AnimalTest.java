package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

    private Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void getFood() {
        Exception actualExeption = assertThrows(Exception.class, () ->
        animal.getFood("Неизвестный вид животного"));

        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", 
                actualExeption.getMessage());
    }

    @Test
    public void getFamily(){
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
        animal.getFamily());
    }
}
