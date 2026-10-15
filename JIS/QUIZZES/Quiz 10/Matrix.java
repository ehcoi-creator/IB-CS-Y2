import java.util.Arrays;

public class Matrix{
    public int[][] matrix;

    public Matrix(int[][] input) {
        matrix = input;
    }

    public int[][] scale(int scale){
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j=0; j<col; j++) {
                result[i][j] = matrix[i][j]*scale;
            }
        }

        return result;
    }

    public void show(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}