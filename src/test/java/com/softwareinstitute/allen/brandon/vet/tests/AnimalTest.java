package com.softwareinstitute.allen.brandon.vet.tests;

import com.softwareinstitute.allen.brandon.vet.Animal;
import com.softwareinstitute.allen.brandon.vet.Bat;
import com.softwareinstitute.allen.brandon.vet.Cat;
import com.softwareinstitute.allen.brandon.vet.FlyingRat;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {
    @Test
    void get_animal_moving(){
        Bat testBat = new Bat(true, "Black");
        assertEquals("Moving", testBat.move(), "Not moving, maybe dead?");
        testBat.die();
        assertEquals("Not Moving", testBat.move(), "IT'S MOVING! Zombie Bats.");
    }
    @Test
    void test_is_animal_alive(){
        Bat testBat = new Bat(true, 4, "Black");
        assertTrue(testBat.isAlive(), "It is dead");
        testBat.die();
        assertFalse(testBat.isAlive(), "It is alive");
    }
    @Test
    void test_get_animal_age(){
        Bat testBat = new Bat(true, 4, "Black");
        assertEquals(4, testBat.getAge(), "Not the same age");
    }
    @Test
    void test_get_animal_colour(){
        Bat testBat = new Bat(true, 4, "Black");
        assertEquals("Black", testBat.getColour(), "Not the same colour");
    }
    @Test
    void test_animal_health(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        Cat testCat = new Cat(true, 3, "Ginger", "Ginger");
        testCat.attack(testBat);
        assertEquals(90, testBat.getHP(), "Bat is invincible");
    }
    @Test
    void test_animal_poop(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Pooping", testBat.poop(), "Bat is constipated");
    }
    @Test
    void test_animal_sleep(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Sleeping", testBat.sleep(), "Bat cannot sleep");
    }
    @Test
    void test_animal_setKills(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setKills(400);
        assertEquals(400, testBat.getKills(), "Kills are not the same");
    }
    @Test
    void test_animal_setColour(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setColour("Grey");
        assertEquals("Grey", testBat.getColour(), "Colours are not the same");
    }
    @Test
    void test_animal_setAge(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setAge(10);
        assertEquals(10, testBat.getAge(), "Ages are not the same");
    }
    @Test
    void test_animal_setAlive(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setAlive(false);
        assertFalse(testBat.isAlive(), "Ages are not the same");
    }
    @Test
    void test_animal_move(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Moving", testBat.move(), "Doesn't move");
        testBat.die();
        assertEquals("Not Moving", testBat.move(), "Bat moves while dead");
    }
    /*@Test
    void test_animal_breed(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        Bat testBat2 = new Bat(true, 4, "Black", 100);
        assertEquals(, testBat.breed(testBat2), "Cannot breed");

    }*/
    @Test
    void get_animals_breeding(){
        Cat testCat = new Cat(true, 4);
        Cat testCat2 = new Cat(true, 4);
        FlyingRat flyingRatTest = new FlyingRat(true, "Grey");
        assertNotNull(testCat.breed(testCat2));
        assertNull(flyingRatTest.breed(testCat2));
    }
}
