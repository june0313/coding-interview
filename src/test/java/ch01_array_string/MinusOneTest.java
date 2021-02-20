package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinusOneTest {
    MinusOne sut;

    @BeforeEach
    void setUp() {
        sut = new MinusOne();
    }

    @Test
    void test() {
        assertTrue(sut.isEditCountWithinOneTime("pale", "ple"));
        assertTrue(sut.isEditCountWithinOneTime("pale", "pales"));
        assertTrue(sut.isEditCountWithinOneTime("pale", "bale"));
        assertTrue(sut.isEditCountWithinOneTime("a", "b"));

        assertFalse(sut.isEditCountWithinOneTime("aaa", "a"));
        assertFalse(sut.isEditCountWithinOneTime("pale", "bake"));
    }
}