package ch01_array_string;

/**
 * 행렬 회전 : 이미지를 표현하는 N x N 행렬이 있다. 이미지의 각 픽셀은 4바이트로 표현된다.
 * 이 때, 이미지를 90도 회전시키는 메서드를 작성하라.
 * 행렬을 추가로 사용하지 않고서도 할 수 있겠는가?
 */
public class Matrix {
    /**
     * 추가 행렬을 사용하는 방법
     */
    public int[][] rotate(int[][] originalMatrix) {
        var size = originalMatrix.length;
        var rotatedMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int column = Math.abs(i - (size - 1));
            for (int j = 0; j <size; j++) {
                int row = j;
                rotatedMatrix[row][column] = originalMatrix[i][j];
            }
        }

       return rotatedMatrix;
    }

    public void rotateSelf(int[][] matrix) {
        var size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size - 1 - i; j++) {
                int currentRow = i;
                int currentColumn = j;
                int currentValue = matrix[currentRow][currentColumn];

                for (int k = 0; k < 4; k++) {
                    var nextRow = currentColumn;
                    var nextColumn = Math.abs(currentRow - (size - 1));
                    var nextValue = matrix[nextRow][nextColumn];

                    matrix[nextRow][nextColumn] = currentValue;

                    currentRow = nextRow;
                    currentColumn = nextColumn;
                    currentValue = nextValue;
                }

                System.out.println();
            }
        }
    }
}
