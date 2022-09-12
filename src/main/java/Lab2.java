public class Lab2 {
    public static void main(String[] args) {
        byte[][] matrixA = {
                {4, -3, 13, 1},
                {4, 5, 6, 1},
                {7, 8, 9, 4},
                {7, 8, 9, 4},
        };
        byte[][] matrixB = {
                {1, 2, 3, 2},
                {4, 5, 6, 5},
                {7, 8, 20, 1},
                {7, 8, 9, 1},
        };
        matrixSolver(matrixA, matrixB);
    }

    static void matrixSolver(byte[][] matrixA, byte[][] matrixB) {
        if (matrixA.length != matrixB.length ||
                matrixA[0].length != matrixB[0].length)
            throw new IllegalStateException("Both matrices must be the same size");

        int col = matrixA.length;
        int row = matrixA[0].length;
        byte[][] matrixC = new byte[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrixC[i][j] = (byte) (matrixA[i][j] + matrixB[i][j]);
            }
        }

        System.out.println("\nTask 1\n");
        System.out.println("Calculated matrix C: ");
        printMatrix(matrixC);

        System.out.println("\nTask 2\n");
        calcMaxMinSum(matrixC);
    }

    private static void calcMaxMinSum(byte[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        int sumMax = 0;
        int sumMin = 0;

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                int max = matrix[0][i];
                for (int j = 1; j < col; j++) {
                    if (matrix[j][i] > max) max = matrix[j][i];
                }
                System.out.println(max + "\t- MAX value in col (i: " + i + ")");
                sumMax += max;
            } else {
                int min = matrix[0][i];
                for (int j = 1; j < col; j++) {
                    if (matrix[j][i] < min) min = matrix[j][i];
                }
                System.out.println(min + "\t- MIN value in col (i: " + i + ")");
                sumMin += min;
            }
        }

        System.out.println("MAX: " + sumMax);
        System.out.println("MIN: " + sumMin);
    }

    private static void printMatrix(byte[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;

        for (byte[] bytes : matrix) {
            for (int j = 0; j < row; j++) {
                if (j == col - 1) System.out.print(bytes[j]);
                else System.out.print(bytes[j] + "\t");
            }
            System.out.println();
        }
    }
}
