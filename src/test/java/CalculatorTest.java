import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

  private final Calculator calculator = new Calculator();

  @Test
  void sum_ok() {
    int a = 2;
    int b = 3;
    int expected = 5;
    int actual = calculator.sum(a, b);
    assertEquals(expected, actual);
  }

  @Test
  void product_ok() {
    int a = 3;
    int b = 4;
    int expected = 12;
    int actual = calculator.product(a, b);
    assertEquals(expected, actual);
  }

  @Test
  void square_ok() {
    double a = 99;
    double b = 0;
    double expected = 1;
    double actual = calculator.square(a, b);
    assertEquals(expected, actual);
  }

}