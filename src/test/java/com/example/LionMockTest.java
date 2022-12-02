package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class) 
public class LionMockTest {

    Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец",new Feline());
    }

    @Spy // mock it partially
    @InjectMocks
    private Feline feline = new Feline();

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Animal.predatorFoodList);
        assertEquals(Animal.predatorFoodList, lion.getFood());
    }
}
