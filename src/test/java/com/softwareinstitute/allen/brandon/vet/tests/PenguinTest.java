package com.softwareinstitute.allen.brandon.vet.tests;

import com.softwareinstitute.allen.brandon.vet.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PenguinTest {
    @Test
    void test_penguin_eats(){
        Penguin testPenguin = new Penguin(true, "Black");
        Penguin testPenguin2 = new Penguin(true, 4,"Black");
        Penguin testPenguin3 = new Penguin(true, 4,"Black", 50);
        assertEquals("Swallows food whole", testPenguin.eat(), "Doesn't eat");
    }
}
