package com.prova.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    void testAdd() {
        Calc calc = new Calc();
        int result = calc.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    void testSub() {
        Calc calc = new Calc();
        int result = calc.sub(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testSub2() {
        Calc calc = new Calc();
        int result = calc.sub(3, 4);
        assertEquals(-1, result);
    }


}
