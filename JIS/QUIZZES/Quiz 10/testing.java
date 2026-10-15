class testing{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int scale = 3;
        Matrix test = new Matrix(matrix);
        int[][] scaled_matrix = test.scale(scale);
        test.show(scaled_matrix);
    }
}


