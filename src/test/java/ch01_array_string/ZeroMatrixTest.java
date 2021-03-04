package ch01_array_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMatrixTest {
    ZeroMatrix sut;

    @BeforeEach
    void setUp() {
        sut = new ZeroMatrix();
    }

    @Test
    void test1() {
        int[][] matrix = {
                {0, 1}
        };

        sut.zero(matrix);

        assertArrayEquals(matrix, new int[][]{
                {0, 0}
        });
    }

    @Test
    void test1_1() {
        int[][] matrix = {
                {1, 0}
        };

        sut.zero(matrix);

        assertArrayEquals(matrix, new int[][]{
                {0, 0}
        });
    }

    @Test
    void test2() {
        int[][] matrix = {
                {0},
                {1}
        };

        sut.zero(matrix);

        assertArrayEquals(matrix, new int[][]{
                {0},
                {0}
        });
    }

    @Test
    void test2_1() {
        int[][] matrix = {
                {1},
                {0}
        };

        sut.zero(matrix);

        assertArrayEquals(matrix, new int[][]{
                {0},
                {0}
        });
    }

    @Test
    void test3() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        sut.zero(matrix);

        assertArrayEquals(matrix, new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        });
    }

    @Test
    void test3_1() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 0},
                {1, 1, 1}
        };

        sut.zero(matrix);

        assertArrayEquals(matrix, new int[][]{
                {1, 0, 0},
                {0, 0, 0},
                {1, 0, 0}
        });
    }

    @Test
    void test3_2() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 0}
        };

        sut.zero(matrix);

        assertArrayEquals(matrix, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 0}
        });
    }
}