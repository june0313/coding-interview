package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DuplicateTest {
    Duplicate sut;

    @BeforeEach
    void setUp() {
        sut = new Duplicate();
    }

    @Test
    void test1() {
        assertTrue(sut.hasDuplicateChar("aa"));
        assertTrue(sut.hasDuplicateChar("apple"));
        assertFalse(sut.hasDuplicateChar("june"));
        assertTrue(sut.hasDuplicateChar("banana"));
        assertFalse(sut.hasDuplicateChar("abcdefghijklmnopqrstuvwxzyABCDEFGHIJKLMNOPQRSTUVWXZY"));
    }

    @Test
    void test2() {
        assertTrue(sut.hasDuplicateChar2("aa"));
        assertTrue(sut.hasDuplicateChar2("apple"));
        assertFalse(sut.hasDuplicateChar2("june"));
        assertTrue(sut.hasDuplicateChar2("banana"));
        assertFalse(sut.hasDuplicateChar3("abcdefghijklmnopqrstuvwxzyABCDEFGHIJKLMNOPQRSTUVWXZY"));
    }

    @Test
    void test3() {
        assertTrue(sut.hasDuplicateChar3("aa"));
        assertTrue(sut.hasDuplicateChar3("apple"));
        assertFalse(sut.hasDuplicateChar3("june"));
        assertTrue(sut.hasDuplicateChar3("banana"));
        assertFalse(sut.hasDuplicateChar3("abcdefghijklmnopqrstuvwxzyABCDEFGHIJKLMNOPQRSTUVWXZY"));
    }
}