
// Gavin Katz, Rohith Gajula, Lalar Rajpurohit, Anish Ummadi
// this is for option 1

public class Matrix {
    public static Double[][] multiply(Double[][] a, Double[][] b) {
        int rowsA = a.length;
        int rowsB = b.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        
        if (colsA != rowsB) {
            throw new IllegalArgumentException("The matrix dimensions must be the same for multiplication");
        }

  
        Double[][] result = new Double[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
