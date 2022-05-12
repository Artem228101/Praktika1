package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getCm() {
        Float a = new Float("580.0");
        Float b = Main.getCm((float) 12);
        assertEquals(a,b);
    }

    @Test
    public void getFut() {
        Float a = new Float("12");
        Float b = Main.getFut((float) 580.0);
        assertEquals(a,b);
    }
}
