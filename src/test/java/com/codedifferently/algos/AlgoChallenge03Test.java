package com.codedifferently.algos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgoChallenge03Test {
    private AlgoChallenge03 shifter;

    @BeforeEach
    public void setUp() {
        shifter = new AlgoChallenge03();
    }

    @Test
    public void testAdvancedVowelShiftLowercase() {
        String message = "aeiou";
        String expected = "xbflr";
        assertEquals(expected, shifter.advancedVowelShift(message, 3));
    }

    @Test
    public void testAdvancedVowelShiftUppercase() {
        String message = "AEIOU";
        String expected = "DHLRX";
        assertEquals(expected, shifter.advancedVowelShift(message, 3));
    }

    @Test
    public void testAdvancedVowelShiftMixed() {
        String message = "HeLLo World!";
        String expected = "HbLLl Wlrld!";
        assertEquals(expected, shifter.advancedVowelShift(message, 3));
    }
}
