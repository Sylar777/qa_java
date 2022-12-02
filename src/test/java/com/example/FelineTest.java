package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class) 
public class FelineTest {

    @Mock
    Animal animal;

    Animal AnimalFromAnyChild;
    Predator felineFromInterfacPredator;
    Feline feline;

    @Test
    public void getFamily(){
        AnimalFromAnyChild = new Feline();
        assertEquals("Кошачьи", AnimalFromAnyChild.getFamily());
    }

    @Test
    public void eatMeat() throws Exception{
        Mockito.when(animal.getFood("Хищник")).thenReturn(Animal.predatorFoodList);
        felineFromInterfacPredator = new Feline();
        assertEquals(Animal.predatorFoodList, felineFromInterfacPredator.eatMeat());
    }

    @Test
    public void getKittensSecondMethod(){
        feline = new Feline();
        assertEquals(1, feline.getKittens(1));
    }
}
