package ch01_array_string;

import java.util.Arrays;

/**
 * M * N 행렬의 한 원소가 0일 경우, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
 */
public class ZeroMatrix {
    public void zero(int[][] matrix) {
        // 최초 0의 좌표를 저장해둔다.
        boolean[][] zeroMarker = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroMarker[i][j] = true;
                }
            }
        }

        for (int row = 0; row < zeroMarker.length; row++) {
            for (int column = 0; column < zeroMarker[row].length; column++) {
                if (zeroMarker[row][column]) {
                    updateRowToZero(matrix, row);
                    updateColumnToZero(matrix, column);
                }
            }
        }
    }

    private void updateColumnToZero(int[][] matrix, int column) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][column] = 0;
        }
    }

    private void updateRowToZero(int[][] matrix, int row) {
        Arrays.fill(matrix[row], 0);
    }
}
