class testing{
    public static void main(String[] args) {
        int[][] numbers = { {1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9} };
        Matrix test = new Matrix(numbers);
        int[] vectorized_matrix = test.vectorize();
        test.show(vectorized_matrix);



    }
}

