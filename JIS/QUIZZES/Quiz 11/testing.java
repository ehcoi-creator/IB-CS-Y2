class testing{
    public static void main(String[] args) {
        int size = 3;
        Matrix test = new Matrix(size);
        int[][] i_matrix = test.identity();
        test.show(i_matrix);
    }
}

