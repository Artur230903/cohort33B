package cohort33.lesson34_20231007;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calculatorSimTest {

  private calculatorSim calculatorSim;

  @BeforeEach
  public void setUp() {
    calculatorSim = new calculatorSim();
  }

  @Test
  public void testAdd() {
    assertEquals(5, calculatorSim.add(2, 3));
  }

}
