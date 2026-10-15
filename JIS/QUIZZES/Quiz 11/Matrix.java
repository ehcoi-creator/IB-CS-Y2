import java.util.Arrays;

public class Matrix{
    public int[][] matrix;
    public int size;

    public Matrix(int size) {
        matrix = new int[size][size];
        this.size = size;
    }

    public int[][] identity() {
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++){
            result[i][i] = 1;
        }

        return result;
    }

    public void show(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}