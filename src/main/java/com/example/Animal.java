package com.example;

import java.util.List;

public class Animal {

    public static List<String> herbivoreFoodList = List.of("Трава", "Различные растения");
    public static List<String> predatorFoodList = List.of("Животные", "Птицы", "Рыба");

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return herbivoreFoodList;
        } else if ("Хищник".equals(animalKind)) {
            return predatorFoodList;
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}