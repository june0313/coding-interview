package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {
    Permutation sut;

    @BeforeEach
    void setUp() {
        sut = new Permutation();
    }

    @Test
    void test() {
        assertTrue(sut.isPermutation("apple", "elppa"));
        assertTrue(sut.isPermutation("abcd", "adbc"));
        assertFalse(sut.isPermutation("apple", "banana"));
        assertFalse(sut.isPermutation("abc", "abcc"));
    }

    @Test
    void test2() {
        assertTrue(sut.isPermutation2("apple", "elppa"));
        assertTrue(sut.isPermutation2("abcd", "adbc"));
        assertFalse(sut.isPermutation2("apple", "banana"));
        assertFalse(sut.isPermutation2("abc", "abcc"));
    }
}