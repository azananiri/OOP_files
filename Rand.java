import java.util.Random;

public class Rand {
  public static int rInt(int number) {
    return new Random().nextInt(number);
  }

  public static int rInt(int number1, int number2) {
    return new Random().nextInt(number2) + number1;
  }
}
