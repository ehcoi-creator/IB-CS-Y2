import java.util.Arrays;


public class ArrayAvg{
    private int[][] array; 

    public ArrayAvg(int[][] input){
        array = input;
    }

    public String getAverage(){
        int row = array[0].length;
        int col = array.length;

        String result = "Row Average: ";
        int sum = 0;

        for (int i=0; i<col; i++){
            for (int j = 0; j < row; j++) {
                sum += array[i][j];
            }

            result += sum/row + " ";
            sum = 0;
        }

        result += "\nColumn Average: ";
        
        for (int j = 0; j < col; j++){
            for (int i=0; i< row; i++) {
                sum += array[i][j];
            }
            
            result += sum/col + " ";
            sum = 0;
        }

        return result;
    }
}