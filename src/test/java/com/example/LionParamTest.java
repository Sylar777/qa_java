package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {
    
    String sex;
    boolean hasMane;

    public LionParamTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Пола животного: {0}, hasMane: {1}")
    public static Object[][] params() {
        return new Object[][] {
                { "Самец", true },
                { "Самка", false }
        };
    }

    @Test
    public void doesHaveMane() throws Exception{
        Lion lion = new Lion(sex, null);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}
