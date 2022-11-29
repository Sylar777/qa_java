package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class) 
public class CatTest {
    
    @Mock
    Animal animal;

    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(new Feline());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(animal.getFood("Хищник")).thenReturn(Animal.predatorFoodList);
        assertEquals(Animal.predatorFoodList, cat.getFood());
    }

    @Test
    public void getSound(){
        assertEquals("Мяу", cat.getSound());
    }
}
