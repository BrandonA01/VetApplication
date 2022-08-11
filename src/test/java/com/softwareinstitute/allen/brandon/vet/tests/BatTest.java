package com.softwareinstitute.allen.brandon.vet.tests;

import com.softwareinstitute.allen.brandon.vet.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BatTest {
    @Test
    public void test_bat_eats(){
        Bat testBat = new Bat(true, 4, "Black");
        testBat.eat();
        assertEquals(1, testBat.getInsectsEaten(), "Bat doesn't eat.");
        testBat.setInsectsEaten(500);
        assertEquals(500, testBat.getInsectsEaten(), "Not the same amount of insects");
    }
    @Test
    public void test_bat_flying(){
        Bat testBat = new Bat(true, "Black");
        assertEquals("Taking Off", testBat.takeOff(), "Not taking off");
        assertEquals("Flapping Continuously", testBat.flying(), "Not flying");
        assertEquals("Landed", testBat.land(), "Still Flying");
    }
}
