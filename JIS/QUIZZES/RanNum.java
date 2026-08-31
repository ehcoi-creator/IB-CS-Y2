//Create a class that generates a random number between 0 and 256, returns a string.
//TEST CASE:
//RanNum generator = new RanNum();
//System.out.println(generator.getNumber());

import java.util.Random;

public class RanNum{
  public String getNumber(){
    Random random = new Random();

    int result = random.nextInt(256);

    return String.valueOf(result);
  }
}
    
