package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlEncoderTest {
    UrlEncoder sut;

    @BeforeEach
    void setUp() {
        sut = new UrlEncoder();
    }

    @Test
    void test() {
        assertEquals("%20", sut.encodeSpace(" "));
        assertEquals("aa", sut.encodeSpace("aa"));
        assertEquals("Mr%20John%20Smith", sut.encodeSpace("Mr John Smith"));
    }

    @Test
    void test2() {
        assertEquals("%20", sut.encodeSpace2(" "));
        assertEquals("aa", sut.encodeSpace2("aa"));
        assertEquals("Mr%20John%20Smith", sut.encodeSpace2("Mr John Smith"));
    }

    @Test
    void test3() {
        char[] chars = new char[1000];
        chars[0] = ' ';

        sut.encodeSpace3(chars, 1);

        assertEquals('%', chars[0]);
        assertEquals('2', chars[1]);
        assertEquals('0', chars[2]);
        assertEquals('\0', chars[3]);
    }
}