package cohort33.homeworks.homework40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DrinkTest {

  private Drink drink;

  @BeforeEach
  public void setUp(){
    drink = new Drink(null,null,0);
  }

  @Test
  void getName() {
    Drink drink = new Drink("Bier", "alcohol", 500);
    Assertions.assertEquals("Bier", drink.getName());
  }

  @Test
  void getType() {
//    Drink drink =
  }

  @Test
  void getVolume() {
  }

  @Test
  void setVolume() {
  }
}