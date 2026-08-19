public class IPv4Gen{
    public String generate() {
        String result = "";

        RanNum ranNum = new RanNum();
        int number;

        for (int i = 0; i <= 3; i++) {
            number = Integer.parseInt(ranNum.getNumber());

            while (number == 256) {
                number = Integer.parseInt(ranNum.getNumber());
            }

            result += number + ".";
        }

        return result.substring(0, result.length() - 1);
    }
}