import java.util.Arrays;

class ADC{
    public static void main(String[] args) {
        double[] readings = {2.0, 1.5, 0.0, 2.02, 4.0, 5.0};
        int result = calculateResolution(0.0, 5.0, readings);
        System.out.println("Required ADC resolution: " + result + " bits");
    }

    public static int calculateResolution(
        double minVolt, double maxVolt, double[] readings
    ){
        Arrays.sort(readings);

        double minDiff = readings[1] - readings[0];

        for (int i = 2; i < readings.length; i++){
            double tempDiff = readings[i] - readings[i-1];

            if (tempDiff < minDiff){
                minDiff = tempDiff;
            }
        }

        double range = maxVolt - minVolt;

        int bit = 0;

        while (range/Math.pow(2,bit) > minDiff){
            bit++;
        }

        return (int) bit;
    }
}