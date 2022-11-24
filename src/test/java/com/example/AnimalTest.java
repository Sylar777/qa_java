package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class AnimalTest {

    @Test
    public void getFood() {
        Exception actualExeption = assertThrows(Exception.class, () ->
                new Animal().getFood("Неизвестный вид животного"));

        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", 
                actualExeption.getMessage());
    }
}
