public class checker{

    boolean test = false;

    public checker(String add) {
        String[] parts = add.split("\\.");

        test = parts.length == 4;

        if (test) {
            for (int i = 0; i < 4; i++){
                int number = castInteger(parts[i]);

                if (0 <= number && number <= 255) {
                } else {
                    test = false;
                }
            }
        }
    }

    private int castInteger(String S) {
        try {
            return Integer.parseInt(S);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}