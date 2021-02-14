package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome sut;

    @BeforeEach
    void setUp() {
        sut = new Palindrome();
    }

    @Test
    void test() {
        assertTrue(sut.isPalindromePermutation("a"));
        assertTrue(sut.isPalindromePermutation("aa"));
        assertTrue(sut.isPalindromePermutation("aab"));
        assertTrue(sut.isPalindromePermutation("acacb"));
        assertTrue(sut.isPalindromePermutation("Tact Coa"));
        assertTrue(sut.isPalindromePermutation(""));

        assertFalse(sut.isPalindromePermutation("an"));
        assertFalse(sut.isPalindromePermutation("asmr"));
        assertFalse(sut.isPalindromePermutation("asmrr"));
        assertFalse(sut.isPalindromePermutation("apple"));
    }
}