import java.util.Arrays;

public class Matrix{
    public int[][] matrix;
    public int size;
    public int[] numbers;

    public Matrix(int size) {
        matrix = new int[size][size];
        this.size = size;
    }

    public Matrix(int[][] userMat) {
        matrix = userMat;
    }

    public Matrix(int[] input) {
        numbers = input;
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

    public void show(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public int[] vectorize() {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] result = new int[row*col];

        int index = 0;

        for (int i = 0; i<row; i++) {
            for (int j = 0; j < col; j++){
                result[index] = matrix[i][j];

                index++;
            }
        }

        return result;
    }

    public int[][] toMatrix(){
        int numSize = (int) Math.ceil(Math.sqrt(numbers.length));
        
        int[][] result = new int[numSize][numSize];

        for (int i = 0; i < numbers.length; i++) {
            result[i/numSize][i%numSize] = numbers[i];
        }

        return result;
    }
}