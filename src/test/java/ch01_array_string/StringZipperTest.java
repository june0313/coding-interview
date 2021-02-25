package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringZipperTest {

    StringZipper sut;

    @BeforeEach
    void setUp() {
        sut = new StringZipper();
    }

    @Test
    void test() {
        assertEquals(sut.zip("a"), "a");
        assertEquals(sut.zip("aa"), "a2");
        assertEquals(sut.zip("aaa"), "a3");
        assertEquals(sut.zip("ab"), "ab");
        assertEquals(sut.zip("aabcccccaaa"), "a2b1c5a3");
        assertEquals(sut.zip("aaaaaaaaaabbbbbbbbbb"), "a10b10");
    }
}