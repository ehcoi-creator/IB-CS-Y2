class ADC{
    public static void main(String[] args) {
        
        double analogSample = 2.35;
        double error = calculateADCError(analogSample);

        System.out.println("ADC Error: " + error + " V");


    }

    public static double calculateADCError(double analogSample){
        int range = 5;
        int resolution = 6;
        double stepSize = range/Math.pow(2, resolution);

        double appValue = Math.floor(analogSample/stepSize)*stepSize;

        return Math.round(Math.abs(analogSample-appValue)*100000.0)/100000.0;

        //rounding code source: https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
    }
}