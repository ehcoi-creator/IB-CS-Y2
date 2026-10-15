import java.util.Arrays;

class testingArrayAvg{
  public static void main(String[] args) {

    int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    ArrayAvg test = new ArrayAvg(numbers);

    System.out.println(test.getAverage());
  }
}
