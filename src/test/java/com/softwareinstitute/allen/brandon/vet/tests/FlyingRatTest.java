package com.softwareinstitute.allen.brandon.vet.tests;
import com.softwareinstitute.allen.brandon.vet.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyingRatTest {
    @Test
    void test_pigeon_eats(){
        FlyingRat frTest = new FlyingRat(true, 4, "Grey", 120);
        assertEquals("Pecks at Greggs Pasty", frTest.eat(), "Can't eat pasty");
    }
    @Test
    void test_pigeon_set_pasties(){
        FlyingRat frTest = new FlyingRat(true, "Grey");
        frTest.setPastiesEaten(5000);
        assertEquals(5000, frTest.getPastiesEaten(), "Can't eat pasty");    }
    @Test
    void test_pigeon_flying(){
        FlyingRat frTest = new FlyingRat(true, 4, "Grey");
        assertEquals("Flapping", frTest.takeOff(), "Not taking off");
        assertEquals("Gliding", frTest.flying(), "Not flying");
        assertEquals("Landed", frTest.land(), "Still Flying");
    }
    @Test
    void test_pigeon_breathe(){
        FlyingRat frTest = new FlyingRat(true, 4, "Grey");
        assertEquals("Breathing...", frTest.breathe(), "Not breathing");
    }
}