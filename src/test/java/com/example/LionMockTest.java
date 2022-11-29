package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class) 
public class LionMockTest {
    
    @Mock
    Feline feline;

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(Animal.predatorFoodList);
        feline = new Feline();
        assertEquals(Animal.predatorFoodList, feline.getFood("Хищник"));
    }

}
