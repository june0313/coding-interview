package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix sut;

    @BeforeEach
    void setUp() {
        sut = new Matrix();
    }

    @Test
    void test_2x2() {
        assertEquals(new int[][]{
                {1, 2},
                {4, 3}
        }, new int[][]{
                {4, 1},
                {3, 2}
        });
    }

    @Test
    void test_3x3() {
        assertEquals(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }, new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        });
    }

    @Test
    void test_4x4() {
       assertEquals(new int[][]{
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        }, new int[][]{
                {4, 3, 2, 1},
                {4, 3, 2, 1},
                {4, 3, 2, 1},
                {4, 3, 2, 1}
        });
    }

    private void assertEquals(int[][] original, int[][] expect) {
        assertArrayEquals(sut.rotate(original), expect);
    }
}