package cohort33.lesson34_20231007;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cohort33.lessons.lesson34_231007.calculatorSim;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calculatorSimTest {

  private cohort33.lessons.lesson34_231007.calculatorSim calculatorSim;

  @BeforeEach
  public void setUp() {
    calculatorSim = new calculatorSim();
  }

  @Test
  public void testAddTwoPositiveNumbers() {
    assertEquals(5, calculatorSim.add(2, 3));
  }

  @Test
  public void testAddTwoNegativeNumbers() {
    assertEquals(-6, calculatorSim.add(-4, -2));
  }

  @Test
  public void testAddTwoResultZero() {
    assertEquals(0, calculatorSim.add(-4, 4));
  }

  @Test
  public void testDivideByZero() {
    assertEquals(-1, calculatorSim.divide(3,0));
  }
  @Test
  public void testDivideTwoPositiveNumbers() {
    assertEquals(3, calculatorSim.divide(30,10));
  }
  @Test
  public void testMultiplyPositiveNumbers(){
    assertEquals(24,calculatorSim.multyply(6,4));
  }
  @Test
  public void testMultiplyNegativeNumbers(){
    assertEquals(-24,calculatorSim.multyply(-6,4));
  }
  @Test
  public void testMultiplyZero(){
    assertEquals(0,calculatorSim.multyply(0,4));
  }
  @Test
  public void testMultiplication(){
    int a = 2;
    int b = 3;
    int result = a * b;
    assertEquals(6, result);
  }
  @Test
  public void testSubstuctPositive(){
    assertEquals(0,calculatorSim.substract(3,3));
  }
}
