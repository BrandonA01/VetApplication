package com.softwareinstitute.allen.brandon.vet.tests;
import com.softwareinstitute.allen.brandon.vet.Bat;
import com.softwareinstitute.allen.brandon.vet.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {
    @Test
    public void test_get_cat_name(){
        Cat testCat = new Cat(true, 4, "Nala", "Black", 100);
        assertEquals("Nala", testCat.getName(), "Not the same name");
        testCat.setName("Dave");
        assertEquals("Dave", testCat.getName(), "Not the same name");
    }
    @Test
    public void test_is_cat_alive(){
        Cat testCat = new Cat(true, "Nala", "Black");
        assertTrue(testCat.isAlive(), "Nala is dead");
        testCat.die();
        assertFalse(testCat.isAlive(), "Nala is alive");
    }
    @Test
    public void test_get_cat_age(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        assertEquals(4, testCat.getAge(), "Not the same age");
    }
    @Test
    public void test_get_cat_colour(){
        Cat testCat = new Cat(false,"Black");
        assertEquals("Black", testCat.getColour(), "Not the same colour");
    }
    @Test
    public void test_cat_kills(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        Bat testBat = new Bat(true, 4, "Grey", 100);
        assertTrue(testBat.isAlive(), "Bat is not alive");
        assertEquals(0, testCat.getKills(), "Cat should have 0 kills");
        testCat.kill(testBat);
        assertFalse(testBat.isAlive(), "Bat is alive");
        assertEquals(1, testCat.getKills(), "Cat should have 1 kill ");
    }
    @Test
    public void test_cat_attack(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        Bat testBat = new Bat(true, 4, "Grey", 100);
        testCat.attack(testBat);
        assertEquals(90, testBat.getHP(), "Cat attack was not effective");
    }
    @Test
    public void get_cat_moving(){
        Cat testCat = new Cat(true, "Black");
        assertEquals("Moving", testCat.move(), "Not moving, maybe dead?");
        testCat.die();
        assertEquals("Not Moving", testCat.move(), "IT'S MOVING! Zombie Cats.");
    }
    @Test
    public void get_cat_eating(){
        Cat testCat = new Cat(true, "Black");
        assertEquals("Shears off chunks of meat", testCat.eat(), "It's not eating.");
    }
}