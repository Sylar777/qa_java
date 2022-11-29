package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class LionTest {

    @Test
    public void LionConstructorExeption() {
        Exception actualExeption = assertThrows(Exception.class, () ->
        new Lion("Самуй", null));

        assertEquals("Используйте допустимые значения пола животного - самец или самка", 
                actualExeption.getMessage());
    }
}
