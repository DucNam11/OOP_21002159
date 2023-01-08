import java.util.Random;

public class Matrices {

    public static void createRandomMatrix(int[][] matrix) {
        Random rd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(100);
            }
        }
    }

    public static void createRandomMatrix(double[][] matrix) {
        Random rd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextDouble(100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rd = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rd.nextInt(100);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix1[i].clone();
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] += matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix1[i].clone();
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] += matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix1[i].clone();
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] -= matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix1[i].clone();
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] -= matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[2][3];
        createRandomMatrix(matrix1);
        System.out.println("Matrix 1: ");
        print(matrix1);

        int[][] matrix2 = createRandomMatrix(2, 3);
        System.out.println("Matrix 2: ");
        print(matrix2);

        int[][] matrix3 = createRandomMatrix(3, 2);
        System.out.println("Matrix 3: ");
        print(matrix3);

        System.out.println("Sum of matrix 1 and matrix 2 is: ");
        print(add(matrix1, matrix2));

        System.out.println("Difference of matrix 1 and matrix 2 is: ");
        print(subtract(matrix1, matrix2));

        System.out.println("Volume of matrix 2 and matrix 3 is: ");
        print(multiply(matrix2, matrix3));

        System.out.print(haveSameDimension(matrix2, matrix3));

//        double[][] matrix1 = new double[2][3];
//        createRandomMatrix(matrix1);
//        System.out.println("Matrix 1: ");
//        print(matrix1);
//
//        double[][] matrix2 = createRandomMatrix(2,3);
//        System.out.println("Matrix 2: ");
//        print(matrix2);
//
//        double[][] matrix3 = createRandomMatrix(3,2);
//        System.out.println("Matrix 3: ");
//        print(matrix3);
//
//        System.out.println("Sum of matrix 1 and matrix 2 is: ");
//        print(add(matrix1,matrix2));
//
//        System.out.println("Difference of matrix 1 and matrix 2 is: ");
//        print(subtract(matrix1,matrix2));
//
//        System.out.println("Volume of matrix 2 and matrix 3 is: ");
//        print(multiply(matrix2,matrix3));
//
//        System.out.print(haveSameDimension(matrix2,matrix3));
    }
}
