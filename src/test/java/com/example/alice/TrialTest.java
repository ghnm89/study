package com.example.alice;

import com.example.alice.trial.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrialTest {

    @Test
    @DisplayName("판사는 목격자를 불러와서 증언하라고 시킨다.")
    void testTrial1() {
        King king = new King();
        Rabbit rabbit = new Rabbit();
        Hatter hatter = new Hatter();

        king.callWitness(rabbit, hatter);
        String testimony = king.orderTestify(hatter);

        assertEquals("재판장 안", hatter.getLocation());
        assertEquals("증언", testimony);
    }

}
