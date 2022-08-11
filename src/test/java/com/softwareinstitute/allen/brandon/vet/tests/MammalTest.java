package com.softwareinstitute.allen.brandon.vet.tests;

import com.softwareinstitute.allen.brandon.vet.Bat;
import com.softwareinstitute.allen.brandon.vet.Mammal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MammalTest {
    @Test
    public void get_mammal_breathing(){
        Mammal testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Breathing...", testBat.breathe(), "Mammal is being asphyxiated");
    }
}
