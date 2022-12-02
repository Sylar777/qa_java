package com.example;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AnimalParamTest {
    
    public String animalKind;
    public List<String> expectedResult;

    public AnimalParamTest(String animalKind, List<String> result){
        this.animalKind = animalKind;
        this.expectedResult = result;
    }

    @Parameterized.Parameters(name = "AnimalKind: {0}, Expected Food: {1}")
    public static Object[][] params() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения") },
                { "Хищник", List.of("Животные", "Птицы", "Рыба") }
        };
    }

    @Test
    public void getFood() throws Exception{
        Animal animal = new Animal();
        assertEquals(expectedResult, animal.getFood(animalKind));
    }
}
