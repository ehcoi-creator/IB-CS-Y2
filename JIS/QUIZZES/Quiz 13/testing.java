class testing{
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 3, 4, 5, 6, 6, 7, 8 };
        Matrix test = new Matrix(numbers);
        int[][] into_matrix = test.toMatrix();
        test.show(into_matrix);
    }
}

